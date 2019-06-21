package com.leetcode.algorithms.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsets {
    public static List<List<Integer>> subsets(int[] nums,int n) {
        List<List<Integer>> lists =new ArrayList<>();
        //lists.add(new ArrayList<>());
        Boolean[] booleans =booleans=new Boolean[nums.length];
        Arrays.fill(booleans, true);
        switch (n){
            case 1:lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums,0));break;
            case 2:lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums,booleans));break;
            case 3:lists.addAll(dpArraySubsets(nums));break;
            default:lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums,booleans));break;
        }

        return lists;
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> lists,List<Integer> tmpList,int nums[],int index){
            if(index == nums.length) {
                return lists;
            }
            for (int i = index; i < nums.length; i++) {
                tmpList.add(nums[i]);
                lists.add(new ArrayList<>(tmpList));
                System.out.println(tmpList);
                backtrack(lists, tmpList, nums,i+1);
                tmpList.remove(tmpList.size() - 1);

            }
        return lists;
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> lists,List<Integer> tmpList,int nums[],Boolean[] booleans){
        if (tmpList.size()!=nums.length){
            //lists.add(new ArrayList<>(tmpList));
        }else {
            int tempx=0;
            for (int i = 0; i < nums.length; i++) {
                if(tempx!=nums[i]&&booleans[i]){
                    tmpList.add(nums[i]);
                    booleans[i]=false;
                    lists.add(new ArrayList<>(tmpList));
                    backtrack(lists, tmpList, nums,booleans);
                    booleans[i]=true;
                    tmpList.remove(tmpList.size() - 1);
                }
            }
        }
        return lists;
    }

    private static List<List<Integer>> dpArraySubsets(int[] nums){
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> tmps=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]!=nums[j]&&i<j){
                    tmps=new ArrayList<>();
                    tmps.add(nums[i]);
                    tmps.add(nums[j]);
                    lists.add(new ArrayList<>(tmps));
                }
            }

            lists.add(new ArrayList<>(tmps));
            tmps=new ArrayList<>();
            tmps.add(nums[i]);
            lists.add(new ArrayList<>(tmps));
        }
        return lists;
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(JSON.toJSONString(ArraySubsets.subsets(a,3)));
    }
}
