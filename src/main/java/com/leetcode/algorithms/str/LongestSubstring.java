package com.leetcode.algorithms.str;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        char[] chars=s.toCharArray();
        int sum=1;
        int left=0;
        for (int i = 0; i < chars.length-1; i++) {
            int curr = chars[i];
            int next = chars[i+1];
            if ((curr^next)!=0){
                sum++;
            }else {
                left=sum;
                sum=1;
            }
        }
        return sum>left?sum:left;
    }

    public static void main(String[] args) {
        String s="abcdabcddd";
        System.out.println(LongestSubstring.lengthOfLongestSubstring(s));
    }
}
