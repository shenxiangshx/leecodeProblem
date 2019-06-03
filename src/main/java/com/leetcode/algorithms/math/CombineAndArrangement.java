package com.leetcode.algorithms.math;

import com.alibaba.fastjson.JSON;

public class CombineAndArrangement {
    private static int[][] tmpArr=null;
    public static void combine(int index,int num,int[] arr){
        tmpArr=new int[num][num];
        if (num<0){
            return;
        }
        if (num==1){
            for (int i = index; i < arr.length; i++) {
                tmpArr[0][i]=arr[i];
                }
        }else {
            for (int j = 0; j < num; j++) {
                for (int i = index; i < arr.length-num; i++) {
                    System.out.println(1);
                    tmpArr[i][j]=arr[i];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[4];
        for (int i = 0; i < 4; i++) {
            ints[i]=i+1;
        }
        System.out.println(JSON.toJSONString(ints));
        CombineAndArrangement.combine(0,3,ints);
        for (int[] ints1 : tmpArr) {
            System.out.println(JSON.toJSONString(ints1));
        }
    }
}
