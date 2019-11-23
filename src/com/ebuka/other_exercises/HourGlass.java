package com.ebuka.other_exercises;

import java.util.ArrayList;
import java.util.Collections;

public class HourGlass {

    static int hourglassSum(int[][] arr) {
        int l1 = arr.length;
        int l2 = arr[0].length;
        int i = 0;
        ArrayList<Integer> arrSum = new ArrayList<>();

        while (i + 2 < l1){
            int j = 0;

            while (j + 2 < l2){
                int sum = 0;
                int m = j;
                sum = arr[i][m] + arr[i][m + 1] + arr[i][m + 2] + arr[i + 1][m + 1] + arr[i + 2][m]
                        + arr[i + 2][m + 1] + arr[i + 2][m + 2];
                arrSum.add(sum);
                j++;
            }
            i++;
        }
        for (int z : arrSum){
            System.out.println(z);
        }
        System.out.println("=======================");
        return Collections.max(arrSum);
    }

    public static void main(String[] args) {
        int[] r1 = new int[]{1, 1, 1, 0, 0, 0};
        int[] r2 = new int[]{0, 1, 0, 0, 0, 0};
        int[] r3 = new int[]{1, 1, 1, 0, 0, 0};
        int[] r4 = new int[]{0, 0, 2, 4, 4, 0};
        int[] r5 = new int[]{0, 0, 0, 2, 0, 0};
        int[] r6 = new int[]{0, 0, 1, 2, 4, 0};

        int[][] arr = new int[][]{r1, r2, r3, r4, r5, r6};

        System.out.println(hourglassSum(arr));
    }
}
