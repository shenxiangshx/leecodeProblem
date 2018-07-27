package com.leetcode.other;

import javax.annotation.PostConstruct;

public class Multithreading {

    @PostConstruct
    private void init(){
        run();
    }
    public void run(){
        new Thread((Runnable) ()->{
                while (true) {
                    try {
                        System.out.println("xxx");
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }).start();
        new Thread((Runnable) ()->{
                while (true) {
                    try {
                        System.out.println("yyy");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }).start();
    }

    public static void main(String[] args) {
        Multithreading mt=new Multithreading();
        mt.init();
    }
}
