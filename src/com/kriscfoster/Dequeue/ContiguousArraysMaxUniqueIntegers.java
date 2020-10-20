package com.kriscfoster.Dequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

// Find max number of unique integers among all possible contiguous sub-arrays of a given size
public class ContiguousArraysMaxUniqueIntegers {

    public static int maxUniqueIntegers(int[] arr, int subArraySize) {
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int max = 0;

        for (int num : arr) {
            deque.add(num);
            set.add(num);

            if (deque.size() == subArraySize) {
                if (set.size() > max) {
                    max = set.size();
                }

                int first = deque.remove();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("CONTIGUOUS ARRAY MAX UNIQUE INTEGERS\n");
        int[] arr = new int[]{ 5, 3, 5, 2, 3, 2 };
        int subArraySize = 3;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Contiguous array size: " + subArraySize);
        System.out.println("Max unique integers in contiguous sub arrays: " + maxUniqueIntegers(arr, subArraySize));
    }
}
