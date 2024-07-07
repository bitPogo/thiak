/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

object RussianPeasantMultiplication {
    private fun Int.isOdd(): Boolean = this % 2 != 0

    fun multiply(number1: Int, number2: Int): Int {
        var left = number1
        var right = number2
        val list: MutableList<Int> = mutableListOf()

        if (number1.isOdd()) {
            list.add(number2)
        }

        while (left != 1) {
            left /= 2
            right *= 2

            if (left.isOdd()) {
                list.add(right)
            }
        }
        return list.sum()
    }
}