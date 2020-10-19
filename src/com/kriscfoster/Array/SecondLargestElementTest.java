package com.kriscfoster.Array;

import org.junit.jupiter.api.Test;

import static com.kriscfoster.Array.SecondLargestElement.find;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class SecondLargestElementTest {

    @Test
    void findShouldReturnSecondLargest() {
        assertThat(4, equalTo(find(new int[]{ 1, 2, 3, 4, 5 })));
    }

    @Test
    void findWhenDecreasingOrder() {
        assertThat(4, equalTo(find(new int[]{ 5, 4, 3, 2, 1 })));
    }

    @Test
    void findWhenLargestIsInMiddle() {
        assertThat(4, equalTo(find(new int[]{ 1, 2, 5, 4, 3 })));
    }
}
