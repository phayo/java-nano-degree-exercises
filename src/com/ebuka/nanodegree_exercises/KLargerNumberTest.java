package com.ebuka.nanodegree_exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KLargerNumberTest {

    @Test
    void topKLarger() {
        assertEquals(KLargerNumber.topKLarger(new int[] {-1, 15, 59, 22, 6, 42, 45, 0}, 4),
                Arrays.asList(22, 42, 45, 59));

        assertEquals(KLargerNumber.topKLarger(new int[] {5, 10, 15, 100, 8}, 2),
                Arrays.asList(15, 100));
    }
}