package com.qianyier.test01;

public class niceString {
    public static void main(String[] args) {
        String s = "YazaAay";
        int pos1 = 0, pos2 = s.length() - 1;
        int num = 0, pos3 = 0, pos4 = 0;
        for (pos1 = 0; pos1 < s.length() - 1; pos1++) {
            for (pos2 = pos1 + 2; pos2 < s.length(); pos2++) {
                if (getPerfect(s.substring(pos1, pos2))) {
//                    System.out.println(pos2 - pos1);
                    if (pos2 - pos1 > num) {
                        num = pos2 - pos1;
                        pos3 = pos1;
                        pos4 = pos2;
                    }
                }
            }
        }
        System.out.println(s.substring(pos3, pos4));
    }

    public static boolean getPerfect(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                int i1 = s.charAt(i) - s.charAt(j);
                if (i1 == 32 || i1 == -32) {
                    break;
                } else if (j == s.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
