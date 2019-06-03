package com.leetcode.bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import sun.jvm.hotspot.utilities.BitMap;

import java.nio.charset.Charset;
import java.util.BitSet;

public class BloomFilterTest {
    private static BloomFilter<String> bloomFilter=BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()),10,0.0001);

    public static void main(String[] args) {
        BitSet bitSet=new BitSet(32);
        BitMap bitMap=new BitMap(201);
        int[] arr = {5,1,6,200};
        int[] bmap=new int[9];
        for (int i : arr) {
            bmap[i/32] |= (1<<(i%32));
            bitSet.set(i,true);
            bitMap.atPut(i,true);
        }

    }

    private static int getBit(int[] bmap,int i){
        return bmap[i/32] & (1 << (i % 32));
    }

}
