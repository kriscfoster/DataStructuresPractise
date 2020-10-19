package com.kriscfoster.Array;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        System.out.println("FIND SECOND LARGEST ELEMENT");
        System.out.println();
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 500, 125, 120, 110, 100 };
        int[] arr3 = { 10, 20, 50, 35, 30 };
        System.out.println(Arrays.toString(arr1));
        System.out.println(find(arr1));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        System.out.println(find(arr2));
        System.out.println();
        System.out.println(Arrays.toString(arr3));
        System.out.println(find(arr3));

    }

    public static int find(int[] arr) {
        int largest;
        int secondLargest;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        for (int el : arr) {
            if (el > largest) {
                secondLargest = largest;
                largest = el;
            } else if (el > secondLargest && el < largest) {
                secondLargest = el;
            }
        }

        return secondLargest;
    }
}
