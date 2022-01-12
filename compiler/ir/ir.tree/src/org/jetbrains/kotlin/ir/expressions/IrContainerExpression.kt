/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.expressions

import org.jetbrains.kotlin.ir.IrStatement

abstract class IrContainerExpression : IrExpression(), IrStatementContainer {
    abstract val origin: IrStatementOrigin?
    abstract val isTransparentScope: Boolean

    override val statements: MutableList<IrStatement> = ArrayList(2)
}
