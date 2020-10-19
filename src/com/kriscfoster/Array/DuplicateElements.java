package com.kriscfoster.Array;

import java.util.*;

// Return the duplicate elements in an array
public class DuplicateElements {

    public static List<Integer> bruteForceFind(int[] arr) {
        List<Integer> duplicate = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicate.add(arr[i]);
                }
            }
        }

        return duplicate;
    }

    public static List<Integer> hashSetFind(int[] arr) {
        List<Integer> duplicate = new ArrayList<>();
        Set<Integer> unique = new HashSet();

        for (int el : arr) {
            if (!unique.add(el)) {
                duplicate.add(el);
            }
        }

        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println("FIND DUPLICATE ELEMENTS");
        System.out.println();
        int[] arr = { 1, 2, 3, 5, 5, 1};

        System.out.println(Arrays.toString(arr));
        System.out.println("\nBRUTE FORCE");
        System.out.println(bruteForceFind(arr));
        System.out.println("\nHASH SET");
        System.out.println(hashSetFind(arr));
    }
}
