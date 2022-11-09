package com.qianyier.test03;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class homeworkTest {
    @Test
    public void test1000insertSort(){

        int[] array = new int[50000];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        // 只需要修改成对应的方法名就可以了
        mySort.insertSort(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void test1000mergeSort(){

        int[] array = new int[50000];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        // 只需要修改成对应的方法名就可以了
        mySort.mergeSort(array);

        System.out.println(Arrays.toString(array));
    }
}
