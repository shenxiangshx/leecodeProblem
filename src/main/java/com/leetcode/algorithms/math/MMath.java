package com.leetcode.algorithms.math;

public class MMath {
    public static int pow(int m,int n){
        int pw=1;
       if (n==1||m==1){
          return m;
       }
       if (n==0){
           return 1;
       }
       if (m==0){
           return 0;
       }
        for (int i=0;i<n/2;i++){
            pw=pw*m*m<2147483647?pw*m*m:2147483647;
        }

        if (n%2!=0){
            pw=pw*m<2147483647?pw*m:2147483647;
        }
       return pw;
    }

}
