package com.app.newislam

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val ar = arrayOf(1, 2, 3, 4, 2, 6, 1, 8, 1)
        var map = HashMap<Int, Int>()
        var first = ar[0]
        var distance = 0
        for (i in 1 until ar.size) {
            var isExists = 0
            for (j in ar.indices) {
                if (first == ar[j]) {
                    distance = j - 1
                    isExists++
                }

            }
            if (isExists > 1) {
                if (map[i]==null)
                map[i] = distance


            }
            distance = 0
            first = ar[i]
        }
        map.forEach {
            println("distance for item ${ar[it.key - 1]} is  =  ${it.value-1}")
        }

    }
}