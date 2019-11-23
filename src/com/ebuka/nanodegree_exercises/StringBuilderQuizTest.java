package com.ebuka.nanodegree_exercises;

import org.junit.Assert;

class StringBuilderQuizTest {

    @org.junit.jupiter.api.Test
    void vowelOnly() {
        String input = "Hello World!";
        String output = StringBuilderQuiz.vowelOnly(input);
        String expected = "eoo";
        Assert.assertEquals(expected, output);
    }
}