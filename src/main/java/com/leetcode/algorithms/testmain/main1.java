package com.leetcode.algorithms.testmain;

import com.leetcode.algorithms.cache.LRUCacheLinkHashMap;

import java.util.ArrayList;
import java.util.List;

public class main1 {

    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={5,6,7};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println("a="+a[i]+"b="+b[j]);
            }
        }
    }
}
