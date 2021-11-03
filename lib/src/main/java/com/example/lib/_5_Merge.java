package com.example.lib;
//归并排序:两个子数组已经排好序,利用归并排序把两个子数组排好序.
public class _5_Merge {
    /*public static void mergeSort(int arr[], int left, int right) {
        System.out.println("mergeSort begin..para left="+left + " right=" + right);
        if(left >= right) {
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
        System.out.println("mergeSort end...");
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
    }*/

    public static void sort(int []arr){
        int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int []temp){

        System.out.println("sort begin.left="+ left + " right:" + right);
        if(left<right){
            int mid = (left+right)/2;

            System.out.println("left sort.");
            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序

            System.out.println("left sort end...");

            System.out.println("right sort begin");
            sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
            System.out.println("right sort end...");
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
        else {
            System.out.println("left >= right");
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        System.out.println("merge left=" + left + " right=" + right);
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
