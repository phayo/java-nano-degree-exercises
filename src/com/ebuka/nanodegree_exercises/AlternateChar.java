package com.ebuka.nanodegree_exercises;

public class AlternateChar {

    static int alternatingCharacters(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length - 1; i++){
            if (c[i] == c[i+1]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABABABAA"));
    }
}
