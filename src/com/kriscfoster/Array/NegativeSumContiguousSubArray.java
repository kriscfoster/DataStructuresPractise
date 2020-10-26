package com.kriscfoster.Array;

import java.util.Arrays;

// Print the number of sub-arrays that have negative sums
public class NegativeSumContiguousSubArray {

    public static void main(String[] args) {
        int[] array = new int[]{ 1, -2, 4, -5, 1 };
        System.out.println(Arrays.toString(array));
        System.out.println(negativeSumSubArrayCount(array));

    }

    private static int negativeSumSubArrayCount(int[] array) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            int sum = 0;
            for (int j=i; j<array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
