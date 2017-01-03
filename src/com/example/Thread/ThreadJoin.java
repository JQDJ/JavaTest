package com.example.Thread;

/**
 * Created by Sven.Zhan on 2016/11/16.
 */

public class ThreadJoin {

    String TAG = ThreadJoin.class.getSimpleName();

    Runnable runnableA = new Runnable() {

        int count = 0;

        @Override
        public void run() {
            while (count < 100) {
                System.out.println("runnableA tid = " + Thread.currentThread().getId() + " count = " + count);
                count++;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable runnableB = new Runnable() {

        int num = 0;

        @Override
        public void run() {
            while (num < 50) {
                System.out.println( "runnableB tid = " + Thread.currentThread().getId() + " num = " + num);
                num++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };


    public void start() {
        long startTime = System.currentTimeMillis();
        System.out.println("mainThread tid = " + Thread.currentThread().getId() + " startTime = " + startTime);
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
        System.out.println("mainThread tid = " + Thread.currentThread().getId() + " timeCoast = " + (System.currentTimeMillis() - startTime));
    }
}
