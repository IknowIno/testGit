package com.qianyier.test03;


public class mySort {
//    public static ArrayList<Integer> insertSort(ArrayList<Integer> list1) {
//        for (int i = 1; i < list1.size(); i++) {
//            int temp = list1.get(i);
//
//            for (int j = 0; j <= i; j++) {
//                if (list1.get(j) > temp) {
//                    list1.remove(i);
//                    list1.add(j, temp);
//                    break;
//                }
//            }
//        }
//        return list1;
//    }
public static void insertSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
        int temp = array[i];

        for (int j = 0; j <= i; j++) {
            if (array[j] > temp) {
                if (array.length - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
                if (array.length - 1 - j >= 0) System.arraycopy(array, j, array, j + 1, array.length - 1 - j);
                array[j] = temp;
                break;
            }
        }
    }

}

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= right) {
            temp[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }

        while (p1 <= mid) {
            temp[i++] = array[p1++];
        }
        while (p2 <= right) {
            temp[i++] = array[p2++];
        }

        for (i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
    }

}
