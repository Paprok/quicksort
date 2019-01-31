package com.codecool.krk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    void testQuickSortUnsorted() {
        QuickSort quicksort = new QuickSort();
        int[] list = {7, 3, 8, 2, 1, 4};

        int[] expected = {1, 2, 3, 4, 7, 8};
        int[] actual = quicksort.quickSort(list);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testQuickSortReversed() {
        QuickSort quicksort = new QuickSort();
        int[] list = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] actual = quicksort.quickSort(list);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testQuickSortSorted() {
        QuickSort quicksort = new QuickSort();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] actual = quicksort.quickSort(list);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testQuickSortEmpty(){
        QuickSort quicksort = new QuickSort();
        int[] list = {};

        int[] expected = {};
        int[] actual = quicksort.quickSort(list);

        assertArrayEquals(expected, actual);
    }
}

