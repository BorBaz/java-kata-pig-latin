package com.bbs;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PigLatin {
    private static final String SPACE = " ";
    private static final String AY = "ay";

    public static String pigIt(String str) {

        return Arrays.stream(str.split(SPACE)).map(word -> {

            String formalized = word;

            if (!isPunctuationMark(formalized)) {
                String firstLetter = formalized.substring(0, 1);
                formalized = formalized.substring(1).concat(firstLetter).concat(AY);
            }

            return formalized;
        }).collect(Collectors.joining(SPACE));

    }

    public static boolean isPunctuationMark(String str) {
        return Pattern.matches("\\p{Punct}", str);
    }
}