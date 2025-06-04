package com.kenny.wenny.performance;

import lombok.val;

import java.util.regex.Pattern;

public class RegexDemo {
    private static final String REGEX = "\\d{10}";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public boolean contains10DigitNumber(String source) {
        val matcher = PATTERN.matcher(source);
        return matcher.find();
    }
}
