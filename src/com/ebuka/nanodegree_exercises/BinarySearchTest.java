package com.ebuka.nanodegree_exercises;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void findIndex() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int target = 5;
        int expect = 4;
        Assert.assertEquals(expect, BinarySearch.findIndex(arr, target));
    }
}