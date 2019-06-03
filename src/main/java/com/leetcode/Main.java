package com.leetcode;

import com.leetcode.algorithms.arraysearch.BalenceRandomSerach;

public class Main {
    public static void main(String[] args) {
        Integer[] ints=new Integer[8];
        for (int i = 0; i < 8; i++) {
            ints[i]=i;
        }
        BalenceRandomSerach balenceRandomSerach=new BalenceRandomSerach(ints,3);
        balenceRandomSerach.printBalenceNum();

    }
}
