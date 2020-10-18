package com.kriscfoster.Array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.kriscfoster.Array.SecondLargestElement.find;

class SecondLargestElementTest {

    @Test
    void findShouldReturnSecondLargest() {
        Assert.assertEquals(4, find(new int[]{ 1, 2, 3, 4, 5 }));
    }

    @Test
    void findWhenDecreasingOrder() {
        Assert.assertEquals(4, find(new int[]{ 5, 4, 3, 2, 1 }));
    }

    @Test
    void findWhenLargestIsInMiddle() {
        Assert.assertEquals(4, find(new int[]{ 1, 2, 5, 4, 3 }));
    }
}
