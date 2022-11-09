package com.qianyier.test01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字数量:");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<num;i++){
            System.out.print("请输入数字:");
            list.addNode(new Node(Integer.parseInt(scanner.nextLine())));
        }
        System.out.println("排序之前:");
        list.print();
        list.insertSortNode();
        System.out.println("排序之后:");
        list.print();

    }
}
