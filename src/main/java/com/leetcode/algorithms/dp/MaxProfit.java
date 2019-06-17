package com.leetcode.algorithms.dp;

import com.alibaba.fastjson.JSON;

public class MaxProfit {
    public static int[] getMaprofit(int[] prices){
        int i=0;
        int max=0;
        int[] p=new int[2];
        while (i<prices.length) {
            int j=i+1;
            while ( j < prices.length&&j>i) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                    p[1] = j+1;
                    p[0]=i+1;
                }
                j++;
            }
            i++;
        }
        return p;
    }

    public static void main(String[] args) {
        int[] prices={7,6,5,4,3,1};
        System.out.println(JSON.toJSONString(MaxProfit.getMaprofit(prices)));
    }
}
