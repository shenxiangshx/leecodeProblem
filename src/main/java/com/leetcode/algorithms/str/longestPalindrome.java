package com.leetcode.algorithms.str;

public class longestPalindrome {
    public char[] setManacherString(String str){
        char[] res=new char[str.length()*2+1];
        int index=0;
        for (int i = 0; i < res.length; i++) {
            res[i]=(i&1)==0?'#':str.charAt(i++);
        }
        return res;
    }
}
