package com.qianyier.test03;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class mySortTest {

    @Test
    public void test02() {
//        Random random = new Random();
//
//        ArrayList<Integer> integers = new ArrayList<>(10);
//        for (int i=0;i<10;i++){
//            integers.add(random.nextInt(100));
//        }
//        for (int i =0;i<integers.size();i++){
//            System.out.print(integers.get(i)+" ");
//        }
//        System.out.println();
//
//        mySort.mergeSort(integers,0,integers.size());
//
//        for (int i =0;i<integers.size();i++){
//            System.out.print(integers.get(i)+" ");
//        }
        int[] array = new int[10];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        // 只需要修改成对应的方法名就可以了
        mySort.mergeSort(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void test03(){
        int[] array = new int[10];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        mySort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
