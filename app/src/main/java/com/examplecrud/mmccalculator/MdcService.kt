package com.examplecrud.mmccalculator

class MdcService {

    companion object {

        fun calculateMdc(numberOne: Int, numberTwo: Int): Int {

            var initialDivider: Int
            var resultOne: Int
            var resultTwo: Int
            var mdc: Int = 0

            if (numberOne < numberTwo) {
                initialDivider = numberOne
            } else {
                initialDivider = numberTwo
            }

            for (i in initialDivider downTo 1) {

                resultOne = numberOne % i
                resultTwo = numberTwo % i

                if (resultOne == 0 && resultTwo == 0) {
                    mdc = i
                    break;
                }
            }

            return mdc
        }
    }

}