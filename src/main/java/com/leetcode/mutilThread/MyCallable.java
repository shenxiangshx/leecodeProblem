package com.leetcode.mutilThread;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author myshenx
 */
public class MyCallable implements Callable<Object> {
    private List<String> list=new ArrayList<>();
    private int start;
    private int end;
    private ConcurrentHashMap<String,String> map;

    public MyCallable(int start, int end, ConcurrentHashMap<String,String> map){
        this.start=start;
        this.end=end;
        this.map=map;
    }

    public List<String> getList() {
        for (int i=this.getStart();i<=this.getEnd();i++){
            String key="a_"+i;
            list.add(this.getMap().get(key));
        }
        return list;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Map<String, String> getMap() {
        return map;
    }


    @Override
    public Object call() {
        System.out.println(">>>" +  this.getStart()+ "任务启动");
        return this.getList();
    }
}
