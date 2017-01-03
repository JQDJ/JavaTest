package com.example.Thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sven.Zhan on 2016/11/22.
 */


public class BlockingQueueTest {

    public void testBlockingQueue(){
        final BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
        long start = System.currentTimeMillis();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    queue.put(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        int value = 0;
        try {
            value = queue.poll(6000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" pool vaule = "+value+" timecoast = "+(System.currentTimeMillis() - start));
    }


    public void testThreadExcutor(){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,30,1,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>(6));
        for(int i=0;i<30;i++){
            final int fi = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("message Tid = "+Thread.currentThread().getId()+" fi = "+fi);
                }
            };
            executor.execute(runnable);
        }


    }

}
