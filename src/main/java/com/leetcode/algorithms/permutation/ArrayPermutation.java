package com.leetcode.algorithms.permutation;

import com.alibaba.fastjson.JSON;
import com.leetcode.template.SortTemplate;

import java.util.HashSet;
import java.util.Set;

public class ArrayPermutation {
    static Set<String> set = new HashSet<>();
    public  Comparable[] allPermutation(Comparable[] a,int l){
        while (l<a.length){
                SortTemplate.exch(a, l, l + 1);
                set.add(JSON.toJSONString(a));
                SortTemplate.exch(a, l, l + 1);
                allPermutation(a, ++l);
        }
        return a;
    }

    public static void main(String[] args) {
        ArrayPermutation arrayPermutation = new ArrayPermutation();
        Comparable[] cp={"a", "b","c","d"};
        Comparable[] comparables = arrayPermutation.allPermutation(cp,0);
        int i=1;
        for (Comparable a:set) {
            System.out.println(i+++" "+a);
        }

    }
}
