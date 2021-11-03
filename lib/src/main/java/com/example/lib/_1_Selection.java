package com.example.lib;

//选择排序:循环一次,找到最小数的位置,和数组最左边交换
public class _1_Selection {
    public static void selectionSort(int[] arr) {

        System.out.println("selectionSort");
        for(int j = 0; j < arr.length; j++) {
            int minPostion = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minPostion]) {
                    minPostion = i;
                }
            }

            System.out.println("minPostion:" + minPostion);
            Test.swap(arr, j, minPostion);

            Test.printDebug(arr);
        }
    }


}
