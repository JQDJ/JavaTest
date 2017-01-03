package com.example.Thread;

public class SynchronizedLock {
	
	private Object lockA = new Object();
	
	private Object lockB = new Object();
	
	public synchronized void methodA(){	
		try {
			System.out.println("Thread " + Thread.currentThread().getName() + " methodA sleep start");
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}
		System.out.println("Thread " + Thread.currentThread().getName() + " methodA end");
	}
	
	
	public synchronized void methodB(){	
		try {
			System.out.println("Thread " + Thread.currentThread().getName() + " holdlock = "+Thread.holdsLock(lockA));
			System.out.println("Thread " + Thread.currentThread().getName() + " methodB sleep start");
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}
		System.out.println("Thread " + Thread.currentThread().getName() + " methodB end");
	}
	
	
	public void methodC(){		
		try {
			System.out.println("Thread "+Thread.currentThread().getName()+" methodC sleep start");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Thread "+Thread.currentThread().getName()+" methodC end");
	}
}
