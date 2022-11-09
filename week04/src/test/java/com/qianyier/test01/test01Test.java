package com.qianyier.test01;

import org.junit.Test;

import java.util.Random;

public class test01Test {
    @Test
    public void test01(){
        int[] arr01 = new int[50000];
        Random random = new Random();
        for (int i=0;i<arr01.length;i++){
            arr01[i] = random.nextInt(100);
        }
        int k = arr01.length;
        test01.betterQuickSort(arr01,0,arr01.length-1,(int)Math.sqrt(k));
        test01.insertSort(arr01,1,arr01.length-1);


//        for (int i = 0; i <= arr01.length - 1; i++) {
//            System.out.print(arr01[i] + " ");
//        }
    }

    @Test
    public void test02(){
        int[] arr01 = new int[50000];
        Random random = new Random();
        for (int i=0;i<arr01.length;i++){
            arr01[i] = random.nextInt(100);
        }
        int k = arr01.length;
        test01.quickSort(arr01,0,arr01.length-1);


//        for (int i = 0; i <= arr01.length - 1; i++) {
//            System.out.print(arr01[i] + " ");
//        }
    }
}
