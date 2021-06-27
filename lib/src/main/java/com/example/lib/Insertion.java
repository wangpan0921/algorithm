package com.example.lib;

//插入排序:从第二个元素开始循环,和它前面的数比较,小则交换,一次循环下来,最小的跑到数组最前面.
public class Insertion {
    public static void insertionSort(int arr[]){
        System.out.println("insertionSort");
        for(int i=1;i < arr.length; i++) {
            for(int j = i;j > 0; j--){
                if(arr[j] < arr[j-1]){
                    Test.swap(arr, j, j-1);
                }
            }
        }
    }
}
