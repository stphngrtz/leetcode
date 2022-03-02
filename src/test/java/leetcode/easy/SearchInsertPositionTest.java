package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPositionTest {

    @Test
    void example1() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
        assertThat(SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
        assertThat(SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    void example3() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
        assertThat(SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void performance() {
        SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5); // warmup
        SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 5); // warmup

        long start, stop;
        int value;

        start = System.nanoTime();
        value = SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5);
        stop = System.nanoTime();
        System.out.println("      searchInsert([1,3,5,6], 5) = " + value + " in " +  (stop-start) + "ns");

        start = System.nanoTime();
        value = SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 5);
        stop = System.nanoTime();
        System.out.println("binarySearchInsert([1,3,5,6], 5) = " + value + " in " +  (stop-start) + "ns");

        start = System.nanoTime();
        value = SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2);
        stop = System.nanoTime();
        System.out.println("      searchInsert([1,3,5,6], 2) = " + value + " in " +  (stop-start) + "ns");

        start = System.nanoTime();
        value = SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 2);
        stop = System.nanoTime();
        System.out.println("binarySearchInsert([1,3,5,6], 2) = " + value + " in " +  (stop-start) + "ns");

        start = System.nanoTime();
        value = SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7);
        stop = System.nanoTime();
        System.out.println("      searchInsert([1,3,5,6], 7) = " + value + " in " +  (stop-start) + "ns");

        start = System.nanoTime();
        value = SearchInsertPosition.binarySearchInsert(new int[]{1, 3, 5, 6}, 7);
        stop = System.nanoTime();
        System.out.println("binarySearchInsert([1,3,5,6], 7) = " + value + " in " +  (stop-start) + "ns");
    }
}