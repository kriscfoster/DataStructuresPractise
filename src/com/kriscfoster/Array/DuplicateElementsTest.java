package com.kriscfoster.Array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kriscfoster.Array.DuplicateElements.bruteForceFind;
import static com.kriscfoster.Array.DuplicateElements.hashSetFind;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class DuplicateElementsTest {

    @Test
    void bruteForceShouldReturnDuplicateElements() {
        int[] arr = { 1, 2, 3, 5, 5, 1};
        List<Integer> duplicate = bruteForceFind(arr);
        assertThat(duplicate.size(), equalTo(2));
        assertThat(duplicate, hasItems(1, 5));
    }

    @Test
    void hashSetShouldReturnDuplicateElements() {
        int[] arr = { 1, 2, 3, 4, 3, 2 };
        List<Integer> duplicate = hashSetFind(arr);
        assertThat(duplicate.size(), equalTo(2));
        assertThat(duplicate, hasItems(2, 3));
    }
}
