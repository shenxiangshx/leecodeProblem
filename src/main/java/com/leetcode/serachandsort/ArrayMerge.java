package com.leetcode.serachandsort;

public class ArrayMerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray=new int[m+n];
        int j=0;
        int k=0;
        for (int i=0;i<m+n;i++){
            if(nums1[k]<nums2[j]&&nums1[k]!=0){
                newArray[i]=nums1[k];
                k++;
            }else {
                newArray[i]=nums2[j];
                j++;
            }
        }
        for (int a:newArray) {
            System.out.println(a);
        }
    }

    
    public static void main(String[] args) {
        int[] m1={1,2,3,0,0,0};
        int[] m2={2,5,6};
        ArrayMerge am=new ArrayMerge();
        am.merge(m1,3,m2,3);
    }
}
