package com.zipcodewilmington.assessment2.part1;

/*
Create a class `WuTangConcatenator` which uses a composite `Integer` to identify divisibility.
    * Multiples of `3` are considered `Wu` numbers.
    * Multiples of `5` are considered `Tang` numbers.
    * Multiples of `3` and `5` are considered `WuTang` numbers.
    A composite number is a positive integer that can be formed by multiplying two smaller positive integers.
 */

public class WuTangConcatenator {

    private Integer concat;

    public WuTangConcatenator(Integer input) {
        this.concat = input;
    }

    public Boolean isWu() {
        return concat % 3 == 0;
    }

    public Boolean isTang() {
        return concat % 5 == 0;
    }

    public Boolean isWuTang() {
       return concat % 3 == 0 && concat % 5 == 0;
    }
}
