package com.kenny.wenny.performance;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public List<Integer> getMultiplesOf5(List<Integer> source) {
        val multiplesOf5 = new ArrayList<Integer>();
        for (val element : source) {
            if (element % 5 == 0) {
                multiplesOf5.add(element);
            }
        }
        return multiplesOf5;
    }

    public List<Integer> getMultiplesOf5WithStream(List<Integer> source) {
        return source.stream()
                .filter(it -> it % 5 == 0)
                .toList();
    }
}
