package com.kenny.wenny.performance;

import lombok.val;

public class LargestInteger {
    public Integer findLargest(int[] numList){
        Integer largestNumber = null;
        for (val number : numList) {
            if (largestNumber == null || largestNumber < number) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
