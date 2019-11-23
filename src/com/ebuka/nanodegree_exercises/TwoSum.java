package com.ebuka.nanodegree_exercises;

import java.util.Arrays;

public class TwoSum {
    public static boolean twoSum(int[] input, int target){
        if(input.length == 0){
            return false;
        }
        for (int i = 0; i < input.length - 1; i++){
            for (int j = i+1; j < input.length; j++){
                if(input[i] + input[j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
