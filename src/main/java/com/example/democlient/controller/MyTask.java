package com.example.democlient.controller;

public class MyTask extends Thread {

    int g = 0;

    @Override
    public void run(){
        this.task();
    }

    public synchronized void task(){
        for (int i = 0; i < 5; i++) {
            //System.out.println(Thread.currentThread().getName() + ":" + i);
            System.out.println(Thread.currentThread().getName()+"****"+g++);

        }
    }

}
