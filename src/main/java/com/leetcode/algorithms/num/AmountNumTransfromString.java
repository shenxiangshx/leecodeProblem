package com.leetcode.algorithms.num;

import java.util.Stack;

public class AmountNumTransfromString {
    //double number = 1032300010.20d;
    public static String translation(double amount){

        String [] moneyUnit =  new String[]{"元","角","分"};
        String [] upperUnit = new String[]{"十","百","千","万","十万","百万","千万","亿"};
        char [] basicNumberUnit = new char [] {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};

        double integerAmount=Math.floor(amount);

        double pointAmount=(amount-integerAmount)*100;
        int jiao=(int)pointAmount/10;
        int fen=(int)pointAmount%10;

        String.valueOf(integerAmount);


        Stack<String> stringNum=new Stack<>();
        Stack<String> stringUpper=new Stack<>();

        stringNum.push(moneyUnit[0]);

        int count=2;
        while (true){
            int mod= (int) (integerAmount%Math.pow(10,count));
            int y=(int) (mod/Math.pow(10,count-1));
            integerAmount-=mod;
            String numStr=String.valueOf(basicNumberUnit[y]);
            int upperIndex=0;
            if (count>1) {
                 upperIndex = (count - 2) % 8;
            }
            //壹十亿零叁千万贰百万叁十万零壹十元贰角零分
            //壹十零亿叁千万贰百万叁十万零万零千零百壹十元贰角零分

            String dStr = upperUnit[upperIndex];
            stringUpper.push(dStr);
            stringNum.push(numStr);

            if (integerAmount/Math.pow(10,count)<1){
                break;
            }
            count++;
        }

        StringBuffer amountString=new StringBuffer();
        while (!stringNum.empty()&&!stringUpper.isEmpty()){
            String sn=stringNum.pop();

            String un=stringUpper.pop();
            if (!sn.equals("零")){
                amountString.append(sn);
           }
           //amountString.append(un);
        }
        amountString.append(String.valueOf(basicNumberUnit[jiao])+"角"+basicNumberUnit[fen]+"分");
        return amountString.toString();
    }

    public static void main(String[] args) {
        double number = 1032300010.20d;
        //double number = 2232032300010.0;
        String amountString=AmountNumTransfromString.translation(number);
        System.out.println(amountString);
    }
}
