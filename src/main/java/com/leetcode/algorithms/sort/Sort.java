package com.leetcode.algorithms.sort;

import com.alibaba.fastjson.JSON;
import com.leetcode.template.SortTemplate;

public class Sort {
    public static int[] quicklySort(int[] arr,int l,int h){
        if(l<h){
            int i = l, j = h, x = arr[l];
            while (i<j) {
                while (i<j&&arr[j]>=x){
                    j--;
                }
                if(i<j){
                    arr[i++] = arr[j];
                }
                while (i<j&&arr[i]<x){
                    i++;
                }
                if (i<j){
                    arr[j--]=arr[i];
                }
             }
             arr[i]=x;
             quicklySort(arr,l,i-1);
             quicklySort(arr,l+1,h);
        }
        return arr;
    }


    public static Comparable[] SelectSort(Comparable[] a){
        int n=a.length;
        for (int i=0;i<n;i++){
            int min =i;
            for (int j=i+1;j<n;j++){
                if (SortTemplate.less(a[i],a[j])) min=j;
                SortTemplate.exch(a,i,min);
            }
        }
        return a;
    }

    public static Comparable[] InsertSort(Comparable[] a){
        int n=a.length;
        for (int i=0;i<n;i++){
            for (int j=i;j>0&&SortTemplate.less(a[i],a[j]);j--)
                SortTemplate.exch(a,j,j-1);
        }
        return a;
    }

    /**
     * 并归排序
     * @param nums
     * @param l
     * @param h
     * @return
     */
    public static int[] mergesort(int[] nums, int l, int h){
        if (l==h){
            return new int[]{nums[l]};
        }
        int mid=(l+(h-1))/2;
        int[] leftArray=mergesort(nums,l,mid);
        int[] rightArray=mergesort(nums,mid+1,h);
        int[] newNUms=new int[leftArray.length+rightArray.length];

        int m = 0, i = 0, j = 0;
        while (i<leftArray.length&&j<rightArray.length){
            newNUms[m++]=leftArray[i]<rightArray[j]?leftArray[i++]:rightArray[j++];
        }
        while (i<leftArray.length){
            newNUms[m++]=leftArray[i++];
        }
        while (j<rightArray.length){
            newNUms[m++]=rightArray[j++];
        }
        return newNUms;
    }

    public static void main(String[] args) {
        int[] nums={1,6,2,1,9,3};
        System.out.println(JSON.toJSONString(Sort.quicklySort(nums,0,5)));

    }
}