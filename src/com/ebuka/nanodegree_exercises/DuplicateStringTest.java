package com.ebuka.nanodegree_exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateStringTest {

    @Test
    void duplicateStringIndex() {
        int answer = DuplicateString.duplicateStringIndex("abcabc");
        assertEquals(3, answer);

        answer = DuplicateString.duplicateStringIndex("abcd");
        assertEquals(-1, answer);

        answer = DuplicateString.duplicateStringIndex("aaaaa");
        assertEquals(1, answer);

        answer = DuplicateString.duplicateStringIndex("");
        assertEquals(-1, answer);

        answer = DuplicateString.duplicateStringIndex("a b a    cd");
        assertEquals(3, answer);

        answer = DuplicateString.duplicateStringIndex("jeez");
        assertEquals(2, answer);

        answer = DuplicateString.duplicateStringIndex("");
        assertEquals(-1, answer);
    }
}