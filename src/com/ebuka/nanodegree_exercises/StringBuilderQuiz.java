package com.ebuka.nanodegree_exercises;

public class StringBuilderQuiz {
    public static void main(String[] args) {
        System.out.println(vowelOnly("Udacity Course"));
    }

    public static String vowelOnly(String input) {
        return input.replaceAll("[^aeiouAEUIO]+", "");
    }

}
