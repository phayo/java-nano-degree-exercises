package com.ebuka.nanodegree_exercises;

import java.util.HashSet;

public class DuplicateString {

    public static int duplicateStringIndex(String s){
        if (s.length() == 0){
            return -1;
        }

        s = s.toLowerCase();

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if (set.contains(s.charAt(i))){
                return i;
            }
            set.add(s.charAt(i));
        }

        return -1;
    }
}
