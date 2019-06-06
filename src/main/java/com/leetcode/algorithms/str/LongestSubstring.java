package com.leetcode.algorithms.str;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        char[] chars=s.toCharArray();
        int sum=0;
        int left=0;
        int bynum=chars[0];
        for (int i = 1; i < chars.length; i++) {
            //System.out.println(bynum);
            System.out.println(bynum&chars[i]);
            if ((bynum&chars[i])==0){
                bynum|=chars[i];
                sum++;
            }else {
                if (left<sum){
                    left=sum;
                }
                sum=0;
                bynum=chars[i];
            }

        }
        return sum>left?sum:left;
    }

    public static void main(String[] args) {
        String s="abcdabcddd";
        //System.out.println(
                LongestSubstring.lengthOfLongestSubstring(s)
                ;
        //);
    }
}
