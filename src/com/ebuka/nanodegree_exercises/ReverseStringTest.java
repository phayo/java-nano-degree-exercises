package com.ebuka.nanodegree_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        assertEquals("!dlroW olleH", ReverseString.reverseString("Hello World!"));
        assertEquals("edcba", ReverseString.reverseString("abcde"));
    }
}