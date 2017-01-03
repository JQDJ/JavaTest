package com.example.Thread;

public class SynchronizedLockTest {
	
	public static void main(String[] args){
		final SynchronizedLock slock = new SynchronizedLock();
		
		final SynchronizedLock slock2 = new SynchronizedLock();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				slock.methodA();
			}			
		},"Thread1").start();	
		
		new Thread(new Runnable(){
			@Override
			public void run() {			
				slock.methodB();
			}			
		},"Thread2").start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				slock.methodC();
			}			
		},"Thread3").start();
		
		
	}
}
