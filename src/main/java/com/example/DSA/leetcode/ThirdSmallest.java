package com.example.DSA.leetcode;


public class ThirdSmallest {
    public static int findThirdSmallest(int[] arr) {
        if (arr.length < 3) {
            return -1; // Not enough elements
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num < second && num != first) {
                third = second;
                second = num;
            } else if (num < third && num != first && num != second) {
                third = num;
            }
        }

        if (third == Integer.MAX_VALUE) {
            return -1; // Third smallest not found (not enough distinct elements)
        } else {
            return third;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 2, 1, 3, 2};
        int result = findThirdSmallest(arr);
        System.out.println("Third smallest = " + result);
    }
}