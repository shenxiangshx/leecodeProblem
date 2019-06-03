package com.leetcode.algorithms.arraysearch;


public class RandomArraySearch {

    private int[] BalenceRandomSerach(int[] arr,int n){
        //[1,2,3,4,5,6,7]
        int len=arr.length;

        int[] t=new int[10];
        for (int i = 0; i < arr.length; i++) {
            if(i%(n+1)==0){
                System.out.println(i);
            }
        }
        return t;
    }

    public static void main(String[] args) {
        RandomArraySearch randomArraySearch=new RandomArraySearch();
        int[] arr=new int[]{3,2,5,6,7,3,8};
        randomArraySearch.BalenceRandomSerach(arr,3);
    }
}
