package com.ebuka.other_exercises;

import java.util.*;

public class isValid {

    // Complete the isValid function below.
    static String isValid(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> occ = new HashMap<>();
        for (char c : arr) {
            if (occ.containsKey(c)) {
                int newValue = occ.get(c) + 1;
                occ.replace(c, newValue);
            } else {
                occ.put(c, 1);
            }
        }

        int min = Collections.max(occ.values());
        int max = Collections.min(occ.values());

        if (min - max == 0){
            return "YES";
        }

        int secMax = max;
        int secMin = min;

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (Map.Entry<Character, Integer> c : occ.entrySet()){
            int val = c.getValue();

            if (counter.containsKey(val)){
                int count = counter.get(val) + 1;
                counter.replace(val, count);
            } else {
                counter.put(val, 1);
            }

            if(val >= max){
                secMax = max;
                max = val;
            }

            if (val <= min){
                secMin = min;
                min = val;
            }
        }

        int avgNum = Integer.MIN_VALUE;
        int lastAvg = avgNum;
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            if( entry.getValue() > lastAvg){
                avgNum = entry.getKey();
                lastAvg = entry.getValue();
            }
        }

        System.out.println(max + " " + min);
        System.out.println(secMax + " " + secMin);
        System.out.println(avgNum);


        if (max == min){
            return "YES";
        } else if (max == avgNum && secMin == avgNum && min - 1 == 0){
            return "YES";
        } else if (min == avgNum && secMax == avgNum && max - 1 == avgNum){
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Type your input string");
//        String s = scanner.nextLine();
//
//        System.out.println(isValid(s));
//        scanner.close();

    }
}
