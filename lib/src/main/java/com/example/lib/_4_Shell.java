package com.example.lib;
//希尔排序是插入排序的升级. 间隔大的时候,移动的少,间隔少,移动的距离短.由于跳着排,所以不稳定.
public class _4_Shell {
    public static void shellSort(int []arr) {
//        int h = 1;
//        while(h < arr.length / 3) {
//            h = h * 3 + 1;
//        }
//        int gap = h;

        long start = System.currentTimeMillis();
        for(int gap = arr.length; gap > 0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        Test.swap(arr, j, j - gap);
                    }
                }
            }
            Test.printDebug(arr);
        }
        long end = System.currentTimeMillis();
        System.out.println("shell cost:" + (end - start));
    }
}

// j = 4 ; a[4] a[0]比较,
// j = 0, 0 < 3

//j = 5; a[5] a[1]
//j=1 1<3

//j=6; a[6] a[2]
//j=2 2<3

//j=7; a[7] a[3]
//j=3 3<3

//j=8; a[8] a[4]
//j=4; a[4] a[0]
//j=0 0<3

//j=9; a[9] a[5]
//j=5; a[5] a[1]
//j=1; 1<3

//j=10; a[10] a[6]
//j=6; a[6] a[2]
//j=2 2<3

//
