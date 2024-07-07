/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import tech.antibytes.lib.RussianPeasantMultiplication.multiply
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals

class RussianPeasantMultiplicationSpec {
    @Test
    @JsName("fn0")
    fun `When 1 is multiplied with 1 it returns 1`() {
        val actual = multiply(1, 1)

        assertEquals(
            actual = actual,
            expected = 1
        )
    }

    @Test
    @JsName("fn1")
    fun `When 1 is multiplied with a number it returns the number`() {
        val number = 5
        val actual = multiply(1, number)

        assertEquals(
            actual = actual,
            expected = number
        )
    }

    @Test
    @JsName("fn2")
    fun `When 2 is multiplied with a number it returns the doubled number`() {
        val number = 5
        val actual = multiply(2, number)

        assertEquals(
            actual = actual,
            expected = number * 2
        )
    }

    @Test
    @JsName("fn3")
    fun `When 47 is multiplied with 42 it returns 1974`() {
        val number1 = 47
        val number2 = 42
        val actual = multiply(number1, number2)

        assertEquals(
            actual = actual,
            expected = 1974
        )
    }
}