package com.leetcode.algorithms.sort;

import com.leetcode.template.SortTemplate;

public class Sort {
    public static int[] quicklySort(int[] arr,int l,int h){
        if(l<h){
            int i = l, j = h, x = arr[l];
            while (i<j) {
                while (i<j&&arr[j]>=x) j--;
                if(i<j) arr[i++] = arr[j];
                while (i<j&&arr[i]<x) i++;
                if (i<j) arr[j--]=arr[i];
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
}