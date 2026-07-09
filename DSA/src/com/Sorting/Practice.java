package com.Sorting;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 1, 8, 5, 3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                return;
            }
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
}