package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    // given two arrays, create a new array with elements from both array. Return the new array
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int index = 0;
        int arrLength = array1.length + array2.length;
        Integer[] newArr = new Integer[arrLength];
        for (Integer n : array1) {
            newArr[index] = n;
            index++;
        }
        for (Integer n : array2) {
            newArr[index] = n;
            index++;
        }
        return newArr;
    }
    //       Integer[] mergeArr = Arrays.copyOf(array1, array1.length + array2.length);
    //       System.arraycopy(array2, 0, mergeArr, array1.length, array2.length);
    //       return mergeArr;

    // given an array and a number, rotate the content to the left as many times as the number given. Return the new rotated array.
    public Integer[] rotate(Integer[] array, Integer numShifts) {
        int index = numShifts;
        Integer[] rotateLeft = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            rotateLeft[i] = array[index];
            index++;
            if (index == array.length) {
                index = 0;
            }
        }
        return rotateLeft;
    }

    // count how many times a number appear in both arrays
    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (Integer n : array1) {
            if (n == valueToEvaluate) {
                count++;
            }
        }
        for (Integer n2 : array2) {
            if (n2 == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    // return the element that appears in the array the most.
    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
