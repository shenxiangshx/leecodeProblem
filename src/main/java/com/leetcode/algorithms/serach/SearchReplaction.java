package com.leetcode.algorithms.serach;

public class SearchReplaction {
    public static int searchBinary(int[] arr,int x){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=(left+right)>>1;
            if (arr[mid]==x){
                return mid;
            }
            if (x<arr[mid]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(searchBinary(arr,99));
    }
}
