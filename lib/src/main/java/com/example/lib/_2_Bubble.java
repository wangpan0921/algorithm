package com.example.lib;
//冒泡排序:相邻两个比较, i的数值大于i+1,则交换.循环一次,最大的排到数组最后.
public class _2_Bubble {
    public static void bubbleSort(int arr[]){
        System.out.println("bubbleSort");
        for(int j=0; j < arr.length - 1; j++) {
            for (int i=0; i < arr.length - 1 - j; i++){
                if (arr[i] > arr[i+1]) {
                    Test.swap(arr, i, i+1);
                }
            }
        }
    }
}
