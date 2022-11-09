package com.qianyier.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入:");
        String line = scanner.nextLine();
        String[] splitString = line.split(" ");
        ArrayList<wordNode> nodes = new ArrayList<>();
        for (String s:splitString){
            wordNode node01 = new wordNode(s.substring(0, s.length() - 1), Integer.parseInt(s.substring(s.length() - 1, s.length())));
            nodes.add(node01);
        }
        for (int i=1;i<nodes.size();i++){
            wordNode temp = nodes.get(i);

            for (int j=0;j<=i;j++){
                if (nodes.get(j).num > temp.num){
                    nodes.remove(i);
                    nodes.add(j,temp);
                    break;
                }
            }
        }

        for (wordNode n:nodes){
            System.out.print(n.word+" ");
        }

    }
}
