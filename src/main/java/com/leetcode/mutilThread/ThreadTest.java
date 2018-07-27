package com.leetcode.mutilThread;

public class ThreadTest {
    public void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("xxx");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
