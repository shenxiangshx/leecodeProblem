package com.leetcode.algorithms.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermute2My {
    public static List<List<Integer>> permute(int[] nums,int n) {
        List<List<Integer>> lists =new ArrayList<>(1);
        Boolean[] booleans =booleans=new Boolean[nums.length];
        Arrays.fill(booleans, true);
        switch (n){
            case 1: lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums));break;
            case 2:lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums,booleans));break;
            default:lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums,booleans));break;
        }
        return lists;
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> lists,List<Integer> tmpList,int nums[]){
        if (tmpList.size()==nums.length){
            lists.add(new ArrayList<>(tmpList));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(tmpList.contains(nums[i])){
                    tmpList.add(nums[i]);
                    backtrack(lists, tmpList, nums);
                    tmpList.remove(tmpList.size() - 1);
                }
            }
        }
        return lists;
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> lists,List<Integer> tmpList,int nums[],Boolean[] booleans){
        if (tmpList.size()==nums.length){
            lists.add(new ArrayList<>(tmpList));
        }else {
            int tmpx=0;
            for (int i = 0; i < nums.length; i++) {
                if(tmpx!=nums[i]&&booleans[i]){
                    tmpx = nums[i];
                    tmpList.add(nums[i]);
                    booleans[i]=false;
                    backtrack(lists, tmpList, nums,booleans);
                    booleans[i]=true;
                    tmpList.remove(tmpList.size() - 1);
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] a={1,1,3};
        System.out.println(JSON.toJSONString(ArrayPermute2My.permute(a,2)));
    }
}
