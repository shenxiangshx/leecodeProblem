package com.leetcode.review.sort;

import com.alibaba.fastjson.JSON;
import com.leetcode.algorithms.sort.Sort;

public class quicklySort {
    public static int[] sort(int[] arr,int left,int right){
        if (arr.length<2){
            return arr;
        }else {
            if (left<right){
                int l=left;
                int r=right;
                int poivt=arr[l];
                while (l<r){
                    while (l<r&&poivt<=arr[r]){
                        r--;
                    }
                    if (l<r){
                        arr[l++]=arr[r];
                    }
                    while (l<r&&poivt>=arr[r]){
                        l++;
                    }
                    if (l<r){
                        arr[l--]=arr[r];
                    }
                }
                arr[l]=poivt;
                sort(arr,l,r-1);
                sort(arr,l+1,r);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={1,6,2,1,9,3};
        System.out.println(JSON.toJSONString(Sort.quicklySort(nums,0,5)));

    }
}
