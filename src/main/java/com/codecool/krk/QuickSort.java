package com.codecool.krk;

public class QuickSort {

    public int[] quickSort(int[] list) {
        int start = 0;
        int end = list.length - 1;
        list = quickSort(start, end, list);
        return list;
    }

    private int[] quickSort(int start, int end, int[] list) {
        if(start < end) {
            list = sort(start, end, list);
        }
        return list;
    }

    private int[] sort(int start, int end, int[] list) {
        int pivot = end;
        for (int i = start; i < pivot; i++) {
            if (list[i] > list[pivot]) {
                pivot = replace(i, pivot, list);
                --i;
            }
        }
        list = quickSort(start, pivot - 1, list);
        list = quickSort(pivot + 1, end, list);
        return list;
    }

    private int replace(int start, int pivot, int[] list) {
        int temp = list[start];
        list[start] = list[pivot - 1];
        list[pivot - 1] = list[pivot];
        list[pivot] = temp;
        return --pivot;
    }

}
