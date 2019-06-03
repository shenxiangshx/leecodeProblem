package com.leetcode.bean;

import java.util.Stack;

public class StringAlgorithmBean {
    private String srcStr;
    private String targetStr;

    private StringAlgorithmBean(String srcStr, String targetStr) {
        this.srcStr = srcStr;
        this.targetStr = targetStr;
    }

    public String getSrcStr() {
        return srcStr;
    }

    public void setSrcStr(String srcStr) {
        this.srcStr = srcStr;
    }

    public String getTargetStr() {
        return targetStr;
    }

    public void setTargetStr(String targetStr) {
        this.targetStr = targetStr;
    }

    private char[] getSrcChar4String(){
        return this.getSrcStr().toCharArray();
    }
    private char[] gettargetChar4String(){
        return this.getSrcStr().toCharArray();
    }

    public String getLCS(String targetStr){
        char[] currChars = this.getSrcChar4String();
        char[] targetChars=this.gettargetChar4String();
        int[][] tmpArray=new int[currChars.length+1][targetChars.length+1];

        for (int i = 0; i <tmpArray[0].length ; i++) {
            tmpArray[0][i]=0;
        }
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i][0]=0;
        }

        for (int m = 1; m < tmpArray.length; m++) {
            for (int n = 1; n < tmpArray[m].length; n++) {
                if (currChars[m-1]==targetChars[n-1]){
                    tmpArray[m][n] = tmpArray[m-1][n-1] + 1;
                }else {
                    tmpArray[m][n] = Math.max(tmpArray[m -1][n], tmpArray[m][n -1]);
                }
            }

        }

        Stack<Character> stack=new Stack<>();

        int i=currChars.length-1;
        int j=targetChars.length-1;
        while(i >= 0 &&  j>= 0){
            //字符串从后开始遍历，如若相等，则存入栈中
            if(currChars[i] == targetChars[j]){
                stack.push(currChars[i]);
                i--;
                j--;
            }else {
                //如果字符串的字符不同，则在数组中找相同的字符，注意：数组的行列要比字符串中字符的个数大1，因此i和j要各加1
                if (tmpArray[i + 1][j] > tmpArray[i][j + 1]) {
                    j--;
                } else {
                    i--;
                }

            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        //打印输出栈正好是正向输出最大的公共子序列
        while(!stack.isEmpty()){
            stringBuffer.append(stack.pop());
        }

        return stringBuffer.toString();
    }
}
