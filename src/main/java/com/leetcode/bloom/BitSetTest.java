package com.leetcode.bloom;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

public class BitSetTest {
    public static void main(String[] args)
    {
        Random random=new Random();

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            int randomResult=random.nextInt(10);
            list.add(randomResult);
        }
        System.out.println("产生的随机数有");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        BitSet bitSet=new BitSet(10);
        for(int i=0;i<10;i++)
        {
            bitSet.set(list.get(i),true);
        }

        System.out.println("0~1亿不在上述随机数中有");
        int count=0;
        for (int i = 0; i < 10; i++)
        {
            if(!bitSet.get(i))
            {
                //System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
