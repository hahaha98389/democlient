package com.example.democlient.controller;

import java.util.concurrent.*;

/**
 * 测试线程方法
 */
public class ThreadTest {




    public static void main(String[] args) {

        ExecutorService threadPool = new ThreadPoolExecutor(
                2,// 两个常开营业窗口
                5,// 五个窗口，其中三个应急用
                3,// 超时存货时间
                TimeUnit.SECONDS,// 超时时间单位
                new LinkedBlockingDeque<>(3),// 银行候客区大小
                Executors.defaultThreadFactory(),// 默认线程池工厂
                new ThreadPoolExecutor.AbortPolicy());

        MyTask myTask = new MyTask();

        //向线程池添加任务
        for(int i = 0; i < 2; i++){
            threadPool.execute(myTask);
        }

        threadPool.shutdown();




    }


}
