package com.apro.multitasking.threads;

public class CallMe {
//	public synchronized void call(String message) {
	public  void call(String message) {
		System.out.print("["+message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
