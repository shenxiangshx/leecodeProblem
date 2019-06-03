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

//    public Comparable[] quicklySort(Comparable[] arr,int low,int hig){
//        if (low<hig){
//            int i = low, j=hig;
//            Comparable x=arr[low];
//            while (i<j){
//                while (i<j&&SortTemplate.less(x,arr[j])){ j--;}
//                if (i<j) arr[i++]=arr[j];
//                while (i<j&&SortTemplate.less(arr[i],x)){ i++;}
//                if (i<j) {arr[j--]=arr[i];}
//            }
//            arr[i]=x;
//            quicklySort(arr,low,i-1);
//            quicklySort(arr,low+1,hig);
//        }
//        return arr;
//    }

    public static void main(String[] args) {
        int[] nums={1,6,2,1,9,3};
        System.out.println(JSON.toJSONString(Sort.quicklySort(nums,0,5)));

    }
}