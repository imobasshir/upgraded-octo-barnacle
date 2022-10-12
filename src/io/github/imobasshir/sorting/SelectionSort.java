package io.github.imobasshir.sorting;

import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            swap(arr, small, i);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, -1, 0, 1, 2, 3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
