package com.kriscfoster.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}
