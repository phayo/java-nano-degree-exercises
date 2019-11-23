package com.ebuka.nanodegree_exercises;

public class BinarySearch {
    public static int findIndex(int[] arr, int num){
        int start = 0; int end = arr.length - 1; int mid = end / 2;
        while(mid > 0){
            if(arr[start] == num){
                return start;
            } else if (arr[end] == num){
                return end;
            } else if(arr[mid] == num){
                return mid;
            } else if (arr[mid] > num) {
                end = mid - 1;
                start = start + 1;
            } else {
                start = mid + 1;
                end = end - 1;
            }
            mid = end / 2;
        }
        return -1;
    }
}
