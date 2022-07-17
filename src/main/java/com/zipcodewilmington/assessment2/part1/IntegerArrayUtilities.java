package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    // `Range` should return an array of integers from `start` to `stop` inclusively.
    public Integer[] range(int start, int stop) {
        int i = 0;
        Integer[] range = new Integer[stop - start + 1];
        for (int n = start; n <= stop; n++) {
            range[i] = n;
            i++;
        } return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    // actually getting the product of last two lol
    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length - 2];
    }

}
