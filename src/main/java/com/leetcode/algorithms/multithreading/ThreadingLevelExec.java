package com.leetcode.algorithms.multithreading;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ThreadingLevelExec {
    public static void main(String[] args) {
        LinkedBlockingQueue queue=new LinkedBlockingQueue(10);
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();

        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(5,5,600000,TimeUnit.MILLISECONDS, queue,namedThreadFactory,new ThreadPoolExecutor.AbortPolicy());

        threadPoolExecutor.execute(()-> {
            Thread.currentThread().setName("A");
            try {
                queue.put(Thread.currentThread());
                Thread.currentThread().join(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        });
        threadPoolExecutor.execute(()-> {
            Thread.currentThread().setName("B");
            try {
                queue.put(Thread.currentThread());
                Thread.currentThread().join(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName());});


        threadPoolExecutor.execute(()-> {
            Thread.currentThread().setName("C");
            System.out.println(Thread.currentThread().getName());
        });

        threadPoolExecutor.shutdown();

    }
}
