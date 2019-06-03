package com.leetcode.algorithms.arraysearch;


import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;

/**
 * @author myshenx
 */
public class RandomArraySearch {

    private Integer[] BalenceRandomSerach(int[] arr, int n){
        if (n>arr.length||n<=0) {
            return null;
        }
        List<Integer> list=new ArrayList<>();
        int ff;
        int fornum=0;
       if (n<=arr.length/2) {
           fornum=n;
            ff = (int) Math.ceil(arr.length / (n + 1.0));
       }else {
           fornum=(arr.length-n);
           ff= (int) Math.ceil(arr.length /(fornum+1.0));
           list=new ArrayList<>(Ints.asList(arr));
       }
        int index=ff-1;
       for (int i=0;i<fornum;i++){
           if (n<=arr.length/2){
               list.add(arr[index]);
           }else {
               list.remove(index);
           }
           index+=ff;
       }

        return list.toArray(new Integer[n]);
    }


    public static void main(String[] args) {
        RandomArraySearch randomArraySearch=new RandomArraySearch();
        int[] arr=new int[]{3,2,5,6,7,3,8};
        Integer[] result = randomArraySearch.BalenceRandomSerach(arr,1);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
