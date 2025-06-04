package com.kenny.wenny.performance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LargestInteger {
    public Optional<Integer> findLargest(int[] numList) {
        return Arrays.stream(numList)
                .boxed()
                .max(Comparator.naturalOrder());

        /* Classic version
        Integer largestNumber = null;
        for (val number : numList) {
            if (largestNumber == null || largestNumber < number) {
                largestNumber = number;
            }
        }
        return Optional.ofNullable(largestNumber);
         */
    }
}
