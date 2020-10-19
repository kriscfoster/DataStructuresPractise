package com.kriscfoster.Array;

import org.junit.jupiter.api.Test;

import static com.kriscfoster.Array.ContinuousSubArraySum.bruteForce;
import static com.kriscfoster.Array.ContinuousSubArraySum.sliding;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubArraySumTest {

    @Test
    void shouldReturnContinuousSubArrayBruteForce() {
        assertArrayEquals(
                new int[]{1, 2},
                bruteForce(new int[]{ 5, 1, 2}, 3)
        );
    }

    @Test
    void shouldReturnContinuousSubArraySliding1() {
        assertArrayEquals(
                new int[]{1, 2},
                sliding(new int[]{ 5, 1, 2}, 3)
        );
    }

    @Test
    void shouldReturnContinuousSubArraySliding2() {
        assertArrayEquals(
                new int[]{1, 2, 4},
                sliding(new int[]{ 5, 1, 2, 4, 6}, 7)
        );
    }

    @Test
    void shouldReturnContinuousSubArraySliding3() {
        assertArrayEquals(
                new int[]{ 2, 4, 8, 9 },
                sliding(new int[]{ 15, 2, 4, 8, 9, 5, 10, 23 }, 23)
        );
    }
}
