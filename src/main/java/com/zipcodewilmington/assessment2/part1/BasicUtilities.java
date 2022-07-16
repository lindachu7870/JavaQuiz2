package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate >= 5 && valueToEvaluate<= 7) {
            return true;
        } else return false;
    }

    public Boolean startsWith(String string, Character character) {
        return string.startsWith(String.valueOf(character));
    }
}
