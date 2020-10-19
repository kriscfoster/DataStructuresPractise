package com.kriscfoster.Array;

import java.util.Arrays;

// Find continuous sub array with sum equal to given number in non-negative integer array
public class ContinuousSubArraySum {

    public static int[] bruteForce(int[] arr, int sum) {
        int currentSum;
        for (int i=0; i<arr.length; i++) {
            currentSum = arr[i];
            for (int j=i+1; j<=arr.length; j++) {
                System.out.println(currentSum);
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
