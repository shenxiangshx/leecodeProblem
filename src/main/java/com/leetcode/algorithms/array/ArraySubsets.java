package com.leetcode.algorithms.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists =new ArrayList<>(1);
        lists.add(new ArrayList<>());
        Boolean[] booleans =booleans=new Boolean[nums.length];
        Arrays.fill(booleans, true);
        lists.addAll(backtrack(new ArrayList<>(1),new ArrayList<>(),nums));
        return lists;
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> lists,List<Integer> tmpList,int nums[]){
        if (tmpList.size()==nums.length){
            //lists.add(new ArrayList<>(tmpList));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(!tmpList.contains(nums[i])){
                    tmpList.add(nums[i]);
                    lists.add(new ArrayList<>(tmpList));
                    backtrack(lists, tmpList, nums);
                    tmpList.remove(tmpList.size() - 1);
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] a={1,2};
        System.out.println(JSON.toJSONString(ArraySubsets.subsets(a)));
    }
}
