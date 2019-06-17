package com.leetcode.algorithms.dp;

import com.alibaba.fastjson.JSON;

public class MaxProfitSingleForeah {

    public static int getMaprofit(int[] prices){
        if( prices == null || prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (min > price){
                min = price;
            }
            if( price - min > maxProfit){
                maxProfit =  price - min;
            }
        }
        

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices={7,6,5,4,3,1};
        System.out.println(JSON.toJSONString(MaxProfitSingleForeah.getMaprofit(prices)));
    }
}
