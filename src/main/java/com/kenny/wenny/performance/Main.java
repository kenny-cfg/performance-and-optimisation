package com.kenny.wenny.performance;

import lombok.val;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        val streams = new StreamExample();
        val source = List.of(10, 15, 20, 2, 3, 7, 25, 9, 150);
        val multiplesOf5 = streams.getMultiplesOf5(source);
        System.out.println(multiplesOf5);
    }
}