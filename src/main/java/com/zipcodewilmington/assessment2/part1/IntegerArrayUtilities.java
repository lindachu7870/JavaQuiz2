package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    // `Range` should return an array of integers from `start` to `stop` inclusively.
    // TODO finish passing the other 2 tests
    public Integer[] range(int start, int stop) {
        Integer[] range = new Integer[stop - start + 1];
        for (int i = start; i <= stop; i++) {
            range[i] = i;
        } return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
