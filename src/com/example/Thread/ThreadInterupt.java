package com.example.Thread;

public class ThreadInterupt {
	
	public void test(){
		final Thread t = Thread.currentThread();		
		new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
				t.interrupt();
			}
			
		}).start();				
		try {
			synchronized(this){
				Thread.sleep(2000);
			}			
		} catch (InterruptedException e) {
			System.out.println(" thread interrupt");
		}	
		System.out.println(" thread interrupt = " + t.isInterrupted());
		System.out.println(" thread interrupt = " + Thread.interrupted());
		System.out.println(" thread interrupt = " + Thread.interrupted());
	}
	
	public void test2(){
		Thread thread = new Thread(mRunnable);
		//thread.setDaemon(true);
		thread.start();
		System.out.println(" main thread start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
		System.out.println(" main thread end ,thread interrupt = "+thread.interrupted());
	}
	
	
	Runnable mRunnable = new Runnable() {		
		@Override
		public void run() {
			try {				
				Thread.sleep(4000);
			} catch (InterruptedException e) {				
				
			}
		}
	};
	

}
