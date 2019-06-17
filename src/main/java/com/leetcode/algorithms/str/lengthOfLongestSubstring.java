package com.leetcode.algorithms.str;

import com.alibaba.fastjson.JSON;

public class lengthOfLongestSubstring {
    //"ababc","udabc"
    public static int[][] getLengthOfLongestSubstring(String str1,String str2){
        int[][] dp=new int[str1.length()][str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)==str2.charAt(0)){
                dp[i][0]=1;
            }
        }
        for (int j = 1; j < str2.length(); j++) {
            if (str1.charAt(0)==str2.charAt(j)){
                dp[0][j]=1;
            }
        }
        for (int i = 1; i < str1.length(); i++) {
            for (int j = 1; j < str2.length(); j++) {
                if (str1.charAt(i)==str2.charAt(j)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
        return dp;
    }

    public static String lct(String str1,String str2){
        if (str1==null||str2==null||str1.equals("")||str2.equals("")){
            return "";
        }
        int[][] dp=getLengthOfLongestSubstring(str1,str2);
        int end=0;
        int max=0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(dp[i][j]>max){
                    end=i;
                    max=dp[i][j];
                    System.out.println("end="+end);
                }

            }
        }
        System.out.println("end:"+end+" max:"+max);
        return str1.substring(end-max+1,end+1);
    }

    public static String lcto1(String str1,String str2){
        if (str1==null||str2==null||str1.equals("")||str2.equals("")){
            return "";
        }
        int end=0;
        int max=0;
        int row=0;
        int col=str2.length()-1;
       while (row<str1.length()){
           int i=row;
           int j=col;
           int len=0;
           while (i<str1.length()&&j<str1.length()){
               if (str1.charAt(i)!=str2.charAt(j)){
                   len=0;
               }else {
                   len++;
               }
               if (len>max){
                   max=len;
                   end=i;
               }
               j++;
               i++;
           }
           if (col>0){
               col--;
           }else {
               row++;
           }
       }
        System.out.println("end:"+end+" max:"+max);
        return str1.substring(end-max+1,end+1);
    }

    public static void main(String[] args) {
        //System.out.println(JSON.toJSONString(lengthOfLongestSubstring.getLengthOfLongestSubstring("ababcx","udabcd")));
        System.out.println(lengthOfLongestSubstring.lcto1("ababcx","udabcd"));
    }
}
