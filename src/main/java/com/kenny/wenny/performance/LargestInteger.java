package com.kenny.wenny.performance;

import lombok.val;

import java.util.Optional;

public class LargestInteger {
    public Optional<Integer> findLargest(int[] numList) {
        Integer largestNumber = null;
        for (val number : numList) {
            if (largestNumber == null || largestNumber < number) {
                largestNumber = number;
            }
        }
        return Optional.ofNullable(largestNumber);
    }
}
