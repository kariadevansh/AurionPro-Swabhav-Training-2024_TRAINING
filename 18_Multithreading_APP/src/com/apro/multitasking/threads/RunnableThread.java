package com.apro.multitasking.threads;

public class RunnableThread implements Runnable{
	private Thread thread;
	
	

	public Thread getThread() {
		return thread;
	}



	public RunnableThread(String name) {
		thread = new Thread(this);
		thread.start();
		thread.setName(name);
	}



	@Override
	public void run() {
		for(int i = 5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+  ": "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
