package com.example.lib;
//归并排序:两个子数组已经排好序,利用归并排序把两个子数组排好序.
public class Merge {
    public static void mergeSort(int arr[], int left, int right) {
        System.out.println("mergeSort begin..para left="+left + " right=" + right);
        if(left == right) {
            System.out.println("RETURN");
            return;
        }
        //分成两半
        int mid = left + (right-left) / 2;
        //左边排序
        System.out.println("left:"+left +" right:"+right + " mid:"+mid);
        mergeSort(arr, left, mid);
        System.out.println("mergeSort left");
        Test.printDebug(arr);
        //右边排序
        mergeSort(arr, mid + 1, right);
        System.out.println("mergeSort right");
        merge(arr, left, mid, right);
//        System.out.println("mergeSort right");
    }

    private static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
//        int mid = arr.length / 2;
        int i = leftPtr;
        int j = rightPtr;
        int k = 0;
        int len = rightBound - leftPtr;
        int temp[] = new int[len];
        while(i < rightPtr && j < rightBound) {
//            System.out.println("i, j " + arr[i] + " " + arr[j]);
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i < rightPtr) {
            temp[k++] = arr[i++];
        }

        while(j < rightBound) {
            temp[k++] = arr[j++];
        }
        for(int m = 0; m < len; m++){
            arr[m] = temp[m];
        }
    }
}
