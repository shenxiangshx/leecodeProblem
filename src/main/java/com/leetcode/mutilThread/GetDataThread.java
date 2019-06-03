package com.leetcode.mutilThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class GetDataThread  implements Runnable{

    private ConcurrentHashMap<String,String> cachemap;
    private String key;
    private int start;
    private int end;
    private List<String> data=new ArrayList<>();;

    @Override
    public void run() {
        String restr = cachemap.get(key);
        System.out.println(Thread.currentThread().getName()+"____"+restr);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (restr!=null) {
            data.add(restr);
        }
    }
    public  GetDataThread(ConcurrentHashMap<String,String> cachemap, String key, int start, int end){
        this.cachemap=cachemap;
        this.key=key;
        this.start=start;
        this.end=end;
    }
    public List<String> getData(){
        return this.data;
    }
}
