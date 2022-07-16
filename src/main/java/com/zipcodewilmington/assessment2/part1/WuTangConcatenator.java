package com.zipcodewilmington.assessment2.part1;

/*
Create a class `WuTangConcatenator` which uses a composite `Integer` to identify divisibility.
    * Multiples of `3` are considered `Wu` numbers.
    * Multiples of `5` are considered `Tang` numbers.
    * Multiples of `3` and `5` are considered `WuTang` numbers.
    A composite number is a positive integer that can be formed by multiplying two smaller positive integers.
 */

public class WuTangConcatenator {

    private Integer concatenator;

    public WuTangConcatenator(Integer input) {
        this.concatenator = input;
    }

    public Boolean isWu() {
        return concatenator % 3 == 0;
    }

    public Boolean isTang() {
        return concatenator % 5 == 0;
    }

    public Boolean isWuTang() {
        if (concatenator % 3 == 0 && concatenator % 5 == 0) {
            return true;
        } else return false;
    }
}
