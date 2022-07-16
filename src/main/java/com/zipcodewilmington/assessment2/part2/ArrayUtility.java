package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    // given two arrays, create a new array with elements from both array. Return the new array
    public Integer[] merge(Integer[] array1, Integer[] array2) {
       Integer[] mergeArr = Arrays.copyOf(array1, array1.length + array2.length);
       System.arraycopy(array2, 0, mergeArr, array1.length, array2.length);
       return mergeArr;
    }

    // given an array and a number, rotate the content to the left as many times as the number given. Return the new rotated array.
    public Integer[] rotate(Integer[] array, Integer index) {
//        Integer[] rotateLeft = new Integer[array.length];
//        for (int i = 0; i < array.length; i++) {
//            }
//        }
        return null;
    }

    // count how many times a number appear in both arrays
    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    // return the element that appears in the array the most.
    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
