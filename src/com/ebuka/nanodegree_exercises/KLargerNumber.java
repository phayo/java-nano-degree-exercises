package com.ebuka.nanodegree_exercises;

import java.util.*;
import java.util.stream.Collectors;

public class KLargerNumber {
    public static List<Integer> topKLarger(int[] arr, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num :  arr) {
            treeSet.add(num);
            if (treeSet.size() > k) {
                treeSet.pollFirst();
            }
        }
        return new ArrayList<>(treeSet);
    }
}
