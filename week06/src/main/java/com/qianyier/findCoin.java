package com.qianyier;

import java.util.Scanner;

public class findCoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入硬币的个数：");
        int n = input.nextInt();

        int[] a = new int[n];
        System.out.println("请分别输入这个" + n + "个硬币的重量：");
        for (int i = 1; i <= n; i++) {
            a[i - 1] = input.nextInt();
        }
//        for (int j = 0; j < a.length; j++) {
//            System.out.println(a[j]);
//        }
        int num = findCoin.weightFindCoin(a,1,n);
        System.out.println(num);

    }

    public static int weightFindCoin(int[] arr, int low, int high) {
        int pos, re = 0, i;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        if (high - low == 1) {             //当遍历到最后两个元素的时候
            if (arr[low] < arr[high]) {
                return low;
            } else {
                return high;
            }
        }
        if ((high - low + 1) % 2 == 0) {
            for (i = low; i <= low + (high - low + 1) / 2 - 1; i++) {
                sum1 += arr[i];
            }
            for (i = low + (high - low + 1) / 2; i <= high; i++) {
                sum2 += arr[i];
            }
            if (sum1 < sum2) {
                re = weightFindCoin(arr, low, low + (high - low + 1) / 2 - 1);
                return re;
            } else if (sum2 < sum1) {
                re = weightFindCoin(arr, low + (high - low + 1) / 2, high);
                return re;
            }
        } else {
            for (i = low; i <= low + (high - low) / 2 - 1; i++) {
                sum1 += arr[i];
            }
            for (i = low + (high - low) / 2 + 1; i <= high; i++) {
                sum2 += arr[i];
            }
            sum3 = arr[low + (high - low) / 2];           //sum3用于存放中间数据
            if (sum1 < sum2) {
                re = weightFindCoin(arr, low, low + (high - low) / 2 - 1);
                return re;
            } else if (sum1 > sum2) {
                re = weightFindCoin(arr, low + (high - low) / 2, high);
                return re;
            } else if (sum1 + sum3 == sum2 + sum3) {
                re = (high - low) / 2 + 1;
                return re;
            }
        }
        return re;


    }

}
