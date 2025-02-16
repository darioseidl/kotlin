// EXPECTED_REACHABLE_NODES: 1372
package foo

fun box(): String {

    assertEquals(true, 'A' == 'A')
    assertEquals(false, 'A' == 'B')
    assertEquals(false, ('A' as Any) == (65 as Any))

    // FIXME(KT-50157): assertEquals(true, 'A' === 'A')
    assertEquals(false, 'A' === 'B')
    assertEquals(false, ('A' as Any) === (65 as Any))

    assertTrue(bar('Q'))
    assertFalse(bar('W'))

    assertTrue(baz('Q'))
    assertFalse(baz('W'))

    return "OK"
}

fun bar(x: Char) = x.equals('Q')

fun baz(x: Any) = x.equals('Q')
