package com.leetcode.bean;

import java.util.ArrayList;
import java.util.List;

public class collectBean {
    private int[] firstArr;
    private int[] scendArr;

    public collectBean(){
        this(new int[0]);
    }
    public collectBean(int[] arr){
        this(arr,arr);
    }

    public collectBean(int[] firstArr,int[] scendArr){
        this.firstArr=firstArr;
        this.scendArr=scendArr;
    }

    public int[] getFirstArr() {
        return firstArr;
    }

    public void setFirstArr(int[] firstArr) {
        this.firstArr = firstArr;
    }

    public int[] getScendArr() {
        return scendArr;
    }

    public void setScendArr(int[] scendArr) {
        this.scendArr = scendArr;
    }

    public int[] intersection(){
        int firstNum=0;
        List<Integer> intersection=new ArrayList<>();
        for (int i : this.getFirstArr()) {
            firstNum |=1<<i%32;
        }
        for (int i : this.getScendArr()) {
            if ((firstNum&(1<<i%32))!=0){
                intersection.add(i);
                firstNum&=firstNum&(1<<i%32);
            }
        }
        int[] ints=new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            ints[i]=intersection.get(i);
        }
        return ints;
    }

}
