package com.ebuka.nanodegree_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQuiz {
    public static void main(String[] args) {
        List<String>  input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");

        System.out.println(input);

        List<String>[] output = groupStringList(input);
        System.out.println(output[0]);
    }

    public static List<String>[] groupStringList(List<String> input){
        if(input == null){
            return null;
        }

        List<String>[] output = new List[3];

        for (int i = 0; i < 3; i++){
            output[i] = new ArrayList<>();
        }

        for(String s: input){
            if (s.matches("^[aA].*")){
                output[0].add(s);
            } else if (s.matches("^[bB].*")){
                output[1].add(s);
            } else {
                output[2].add(s);
            }
        }
        return output;
    }
}
