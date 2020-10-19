package com.kriscfoster.Array;

import java.util.Arrays;

// Return a continuous sub array with a sum equal to given number in a non-negative Integer array
public class ContinuousSubArraySum {

    public static void main(String args[]) {
        System.out.println("CONTINUOUS SUB ARRAY SUM");
        System.out.println();

        int[] arr1 = new int[]{ 5, 1, 2};
        int sum1 = 3;
        int[] arr2 = new int[]{ 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum2 = 23;

        System.out.println("BRUTE FORCE");
        System.out.println(Arrays.toString(arr1) + ", " + sum1);
        System.out.println(Arrays.toString(bruteForce(arr1, sum1)));
        System.out.println();
        System.out.println(Arrays.toString(arr2) + ", " + sum2);
        System.out.println(Arrays.toString(bruteForce(arr2, sum2)));

        System.out.println();
        System.out.println("SLIDING");
        System.out.println(Arrays.toString(arr1) + ", " + sum1);
        System.out.println(Arrays.toString(sliding(arr1, sum1)));
        System.out.println();
        System.out.println(Arrays.toString(arr2) + ", " + sum2);
        System.out.println(Arrays.toString(sliding(arr2, sum2)));
    }

    public static int[] bruteForce(int[] arr, int sum) {
        int currentSum;
        for (int i=0; i<arr.length; i++) {
            currentSum = arr[i];
            for (int j=i+1; j<=arr.length; j++) {
                if (currentSum == sum) {
                    return Arrays.copyOfRange(arr, i, j);
                } else if (currentSum > sum || j == arr.length) {
                    break;
                }

                currentSum += arr[j];
            }
        }

        return null;
    }

    public static int[] sliding(int[] arr, int sum) {
        int currentSum = 0;
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == sum) {
                return Arrays.copyOfRange(arr, start, i);
            }

            if (i < arr.length) {
                currentSum = currentSum + arr[i];
            }
        }

        return null;
    }
}
