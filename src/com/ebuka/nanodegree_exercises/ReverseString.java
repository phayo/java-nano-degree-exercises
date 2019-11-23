package com.ebuka.nanodegree_exercises;

public class ReverseString {
    public static String reverseString(String s){
        if(s.length() == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
