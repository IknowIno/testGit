package com.qianyier;

public class grayCode {
    public static void main(String[] args) {
        String[] gray = getGray(3);
        for (String i:gray){
            System.out.println(i);
        }
        //System.out.println(gray);
    }
    public static String[] getGray(int n) {
        String[] ret = null;
        if(n == 1){
            ret = new String[]{"0","1"};
        }else{
            String[] strs = getGray(n-1);
            ret = new String[2*strs.length];
            for(int i=0; i<strs.length; i++){
                ret[i] = "0"+strs[i];
                ret[ret.length-1-i] = "1"+strs[i];
            }
        }
        return ret;
    }
}
