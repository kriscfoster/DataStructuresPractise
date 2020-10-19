package com.kriscfoster.Other;

import java.util.Arrays;

// Generic methods are a very efficient way to handle multiple data-types using a single method
public class Generics {
    public static <E> void printArray(E[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("GENERICS");
        printArray(new String[]{ "John", "Simon", "Peter" });
        printArray(new Integer[]{ 1, 2, 3, 4 });
    }
}
