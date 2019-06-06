package com.leetcode.algorithms.math;

public class MMath {
    public static int pow(int x,int n){
        int pw=1;
       if (n==1||x==1){
          return x;
       }
       if (n==0){
           return 1;
       }
       if (x==0){
           return 0;
       }
        for (int i=0;i<n/2;i++){
            pw=pw*x*x<2147483647?pw*x*x:2147483647;
        }

        if (n%2!=0){
            pw=pw*x<2147483647?pw*x:2147483647;
        }
        if (n<0){
            return 1/pw;
        }
        return 1/pw;
    }

}
