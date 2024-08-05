package com.apro.multithreading.test;

public class ThreadTest {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		
		thread.setName("1st thread");
		System.out.println(thread);
		
		
		for(int i=0;i<5;i++) {
			System.out.println(thread.getName()+  ": "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
