package com.kriscfoster.Array;

public class SecondLargestElement {

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
