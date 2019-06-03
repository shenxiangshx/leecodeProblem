package com.leetcode.mutilThread;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolsTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConcurrentHashMap<String,String> cacheMap=new ConcurrentHashMap<>();
        cacheMap.put("a_1","1");
        cacheMap.put("a_2","2");
        cacheMap.put("a_3","3");
        cacheMap.put("a_4","4");
        cacheMap.put("a_5","5");
        cacheMap.put("a_6","6");
        cacheMap.put("a_7","7");
        cacheMap.put("a_8","8");
        cacheMap.put("a_9","9");
        cacheMap.put("a_10","10");
        cacheMap.put("a_11","11");
        cacheMap.put("a_12","12");

        List<String> list=new ArrayList<>();

        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(5);
        ThreadFactory threadFactory= Thread::new;
        ExecutorService pool = new ThreadPoolExecutor(3,9,60,TimeUnit.SECONDS,queue,threadFactory);

        Callable callable=new MyCallable(1,5,cacheMap);
        Callable callable1=new MyCallable(6,10,cacheMap);
        Callable callable2=new MyCallable(11,12,cacheMap);

        @SuppressWarnings("unchecked")
        Future result=pool.submit(callable);
        @SuppressWarnings("unchecked")
        Future result1=pool.submit(callable1);
        @SuppressWarnings("unchecked")
        Future result2=pool.submit(callable2);
        pool.shutdown();

        @SuppressWarnings("unchecked")
        List<String> list1=JSON.parseObject(String.valueOf(result.get()),List.class);
        @SuppressWarnings("unchecked")
        List<String> list2=JSON.parseObject(String.valueOf(result1.get()),List.class);
        @SuppressWarnings("unchecked")
        List<String> list3=JSON.parseObject(String.valueOf(result2.get()),List.class);

        list.addAll(list1);
        list.addAll(list2);
        list.addAll(list3);

        System.out.println(JSON.toJSONString(list));
    }
}
