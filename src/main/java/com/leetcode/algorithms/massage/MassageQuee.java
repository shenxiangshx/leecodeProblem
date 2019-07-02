package com.leetcode.algorithms.massage;

import com.leetcode.bean.MsNode;

import java.util.HashMap;

public class MassageQuee {
    private HashMap<Integer,MsNode> headMap;
    private HashMap<Integer,MsNode> tailMap;
    private int lastPrint;

    public MassageQuee(){
        headMap=new HashMap<>();
        tailMap=new HashMap<>();
        lastPrint=0;
    }

    public void receive(int num){
        if(num<1){
            return;
        }
        MsNode cur=new MsNode(num);
        headMap.put(num,cur);
        tailMap.put(num,cur);

        if (tailMap.containsKey(num-1)){
           headMap.get(num-1).next=cur;
           tailMap.remove(num-1);
           headMap.remove(num);
        }
        if (headMap.containsKey(num+1)){
            cur.next=headMap.get(num+1);
            tailMap.remove(num);
            headMap.remove(num+1);
        }
        if (headMap.containsKey(lastPrint+1)){

        }
    }

    public void print(){
        MsNode node=new MsNode(++lastPrint);
        headMap.remove(lastPrint);
        while (node!=null){
            System.out.println(node.val+" ");
            node=node.next;
            lastPrint++;
        }
        tailMap.remove(--lastPrint);
        System.out.println();
    }

}
