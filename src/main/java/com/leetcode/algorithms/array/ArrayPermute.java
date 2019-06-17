package com.leetcode.algorithms.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermute {
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            dfs(nums, nums.length, 0, result);
            return result;
        }

        public static void dfs(int[] nums, int n, int index, List<List<Integer>> result) {
            if (index == n - 1) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(nums[i]);
                }
                result.add((list));
                return;
            }

            for (int i = index; i < nums.length; i++) {
                //交换元素位置
                swap(nums, index, i);
                dfs(nums, n, index + 1, result);
                //回溯
                swap(nums, index, i);
            }
        }

        public static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    public static void main(String[] args) {
        int[] ints={1,2,3};
        System.out.println(JSON.toJSONString(ArrayPermute.permute(ints)));
    }
}
