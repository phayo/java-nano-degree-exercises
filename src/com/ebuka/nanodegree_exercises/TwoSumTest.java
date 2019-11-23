package com.ebuka.nanodegree_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        assertTrue(TwoSum.twoSum(new int[]{1,2,3,4}, 5));

        assertFalse(TwoSum.twoSum(new int[]{1,4,5,1,6}, 12));

        assertFalse(TwoSum.twoSum(new int[]{1,1,1,1,1,1,1}, 1));

        assertTrue(TwoSum.twoSum(new int[]{1,1,2,2,3,4}, 7));

        assertTrue(TwoSum.twoSum(new int[]{-100, 100, -50, 50, -25, 25, -12, 12}, 75));

        assertFalse(TwoSum.twoSum(new int[0], 5));
    }
}