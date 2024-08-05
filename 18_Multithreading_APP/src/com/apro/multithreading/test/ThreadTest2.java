package com.apro.multithreading.test;

import com.apro.multitasking.threads.MyThread;

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThread thread = new MyThread("thread");
		MyThread thread2 = new MyThread("thread2");
		MyThread thread3 = new MyThread("thread3");
		
		thread.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(thread.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
//		System.out.println(thread);
		
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+  ": "+ i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			thread.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(thread.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
	}

}
