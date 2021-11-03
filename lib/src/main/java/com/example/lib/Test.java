package com.example.lib;

public class Test {
    public static void main(String[] args) {
//        int arr[] = {2, 5, 7, 9, 4, 1, 3, 0, 6, 8};
//        int arr[] = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
//        int arr[] = {1, 4, 7, 8, 3, 6, 9};
//        int arr[] = {1, 4, 6, 7, 10, 2, 3, 5, 8, 9};
        int arr[] = {4, 1, 7, 3, 6, 9};
        printDebug(arr);
//        Selection.selectionSort(arr);
//        Bubble.bubbleSort(arr);
//        Insertion.insertionSort(arr);
//        Shell.shellSort(arr);
//        _5_Merge.mergeSort(arr, 0 , arr.length - 1);
        _5_Merge.sort(arr);
        printDebug(arr);
    }

    public static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }

    public static void printDebug(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
