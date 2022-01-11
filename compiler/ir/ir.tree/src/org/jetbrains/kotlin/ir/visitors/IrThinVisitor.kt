/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.visitors

import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.declarations.*
import org.jetbrains.kotlin.ir.expressions.*

abstract class IrThinVisitor<out R, in D> {
    abstract fun visitElement(element: IrElement, data: D): R

    open fun visitModuleFragment(declaration: IrModuleFragment, data: D): R =
        visitElement(declaration, data)

    open fun visitFile(declaration: IrFile, data: D): R =
        visitElement(declaration, data)

    open fun visitExternalPackageFragment(declaration: IrExternalPackageFragment, data: D): R =
        visitElement(declaration, data)

    open fun visitScript(declaration: IrScript, data: D): R =
        visitElement(declaration, data)

    open fun visitClass(declaration: IrClass, data: D): R =
        visitElement(declaration, data)

    open fun visitSimpleFunction(declaration: IrSimpleFunction, data: D): R =
        visitElement(declaration, data)

    open fun visitConstructor(declaration: IrConstructor, data: D): R =
        visitElement(declaration, data)

    open fun visitProperty(declaration: IrProperty, data: D) =
        visitElement(declaration, data)

    open fun visitField(declaration: IrField, data: D) =
        visitElement(declaration, data)

    open fun visitLocalDelegatedProperty(declaration: IrLocalDelegatedProperty, data: D) =
        visitElement(declaration, data)

    open fun visitVariable(declaration: IrVariable, data: D) =
        visitElement(declaration, data)

    open fun visitEnumEntry(declaration: IrEnumEntry, data: D) =
        visitElement(declaration, data)

    open fun visitAnonymousInitializer(declaration: IrAnonymousInitializer, data: D) =
        visitElement(declaration, data)

    open fun visitTypeParameter(declaration: IrTypeParameter, data: D) =
        visitElement(declaration, data)

    open fun visitValueParameter(declaration: IrValueParameter, data: D) =
        visitElement(declaration, data)

    open fun visitTypeAlias(declaration: IrTypeAlias, data: D) =
        visitElement(declaration, data)

    open fun visitExpressionBody(body: IrExpressionBody, data: D) =
        visitElement(body, data)

    open fun visitBlockBody(body: IrBlockBody, data: D) =
        visitElement(body, data)

    open fun visitSyntheticBody(body: IrSyntheticBody, data: D) =
        visitElement(body, data)

    open fun visitSuspendableExpression(expression: IrSuspendableExpression, data: D) =
        visitElement(expression, data)

    open fun visitSuspensionPoint(expression: IrSuspensionPoint, data: D) =
        visitElement(expression, data)

    open fun visitConst(expression: IrConst<*>, data: D) =
        visitElement(expression, data)

    open fun visitConstantObject(expression: IrConstantObject, data: D) =
        visitElement(expression, data)

    open fun visitConstantPrimitive(expression: IrConstantPrimitive, data: D) =
        visitElement(expression, data)

    open fun visitConstantArray(expression: IrConstantArray, data: D) =
        visitElement(expression, data)

    open fun visitVararg(expression: IrVararg, data: D) =
        visitElement(expression, data)

    open fun visitSpreadElement(spread: IrSpreadElement, data: D) =
        visitElement(spread, data)

    open fun visitBlock(expression: IrBlock, data: D) =
        visitElement(expression, data)

    open fun visitComposite(expression: IrComposite, data: D) =
        visitElement(expression, data)

    open fun visitStringConcatenation(expression: IrStringConcatenation, data: D) =
        visitElement(expression, data)

    open fun visitGetObjectValue(expression: IrGetObjectValue, data: D) =
        visitElement(expression, data)

    open fun visitGetEnumValue(expression: IrGetEnumValue, data: D) =
        visitElement(expression, data)

    open fun visitGetValue(expression: IrGetValue, data: D) =
        visitElement(expression, data)

    open fun visitSetValue(expression: IrSetValue, data: D) =
        visitElement(expression, data)

    open fun visitGetField(expression: IrGetField, data: D) =
        visitElement(expression, data)

    open fun visitSetField(expression: IrSetField, data: D) =
        visitElement(expression, data)

    open fun visitCall(expression: IrCall, data: D) =
        visitElement(expression, data)

    open fun visitConstructorCall(expression: IrConstructorCall, data: D) =
        visitElement(expression, data)

    open fun visitDelegatingConstructorCall(expression: IrDelegatingConstructorCall, data: D) =
        visitElement(expression, data)

    open fun visitEnumConstructorCall(expression: IrEnumConstructorCall, data: D) =
        visitElement(expression, data)

    open fun visitGetClass(expression: IrGetClass, data: D) =
        visitElement(expression, data)

    open fun visitFunctionReference(expression: IrFunctionReference, data: D) =
        visitElement(expression, data)

    open fun visitPropertyReference(expression: IrPropertyReference, data: D) =
        visitElement(expression, data)

    open fun visitLocalDelegatedPropertyReference(expression: IrLocalDelegatedPropertyReference, data: D) =
        visitElement(expression, data)

    open fun visitRawFunctionReference(expression: IrRawFunctionReference, data: D) =
        visitElement(expression, data)

    open fun visitFunctionExpression(expression: IrFunctionExpression, data: D) =
        visitElement(expression, data)

    open fun visitClassReference(expression: IrClassReference, data: D) =
        visitElement(expression, data)

    open fun visitInstanceInitializerCall(expression: IrInstanceInitializerCall, data: D) =
        visitElement(expression, data)

    open fun visitTypeOperator(expression: IrTypeOperatorCall, data: D) =
        visitElement(expression, data)

    open fun visitWhen(expression: IrWhen, data: D) =
        visitElement(expression, data)

    open fun visitBranch(branch: IrBranch, data: D) =
        visitElement(branch, data)

    open fun visitElseBranch(branch: IrElseBranch, data: D) =
        visitBranch(branch, data)

    open fun visitWhileLoop(loop: IrWhileLoop, data: D) =
        visitElement(loop, data)

    open fun visitDoWhileLoop(loop: IrDoWhileLoop, data: D) =
        visitElement(loop, data)

    open fun visitTry(aTry: IrTry, data: D) =
        visitElement(aTry, data)

    open fun visitCatch(aCatch: IrCatch, data: D) =
        visitElement(aCatch, data)

    open fun visitBreak(jump: IrBreak, data: D) =
        visitElement(jump, data)

    open fun visitContinue(jump: IrContinue, data: D) =
        visitElement(jump, data)

    open fun visitReturn(expression: IrReturn, data: D) =
        visitElement(expression, data)

    open fun visitThrow(expression: IrThrow, data: D) =
        visitElement(expression, data)

    open fun visitDynamicOperatorExpression(expression: IrDynamicOperatorExpression, data: D) =
        visitElement(expression, data)

    open fun visitDynamicMemberExpression(expression: IrDynamicMemberExpression, data: D) =
        visitElement(expression, data)

    open fun visitErrorDeclaration(declaration: IrErrorDeclaration, data: D) =
        visitElement(declaration, data)

    open fun visitErrorExpression(expression: IrErrorExpression, data: D) =
        visitElement(expression, data)

    open fun visitErrorCallExpression(expression: IrErrorCallExpression, data: D) =
        visitErrorExpression(expression, data)
}
