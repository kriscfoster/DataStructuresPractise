package com.kriscfoster.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Given a chocolate bar, two children, Lily and Ron, are determining how to share it.
 * Each of the squares has an integer on it. Lily decides to share a contiguous segment of the bar selected such that:
 * 1. The length of the segment matches Ron's birth month, and,
 * 2. The sum of the integers on the squares is equal to his birth day.
 *
 * Return an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.
 */
public class ContiguousArraySegments {

    public static int birthday(int[] array, int birthDay, int birthMonth) {
        Deque<Integer> list = new LinkedList<>();
        int count = 0;
        int sum = 0;

        for (int num : array) {
            list.add(num);
            sum += num;

            if (list.size() > birthMonth) {
                sum -= list.remove();
            }

            if (list.size() == birthMonth && sum == birthDay) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthday(new int[]{ 1, 2, 1, 3, 2 }, 3, 2));
        System.out.println(birthday(new int[]{ 1, 1, 1, 1, 1, 1, 1 }, 3, 3));
    }
}
