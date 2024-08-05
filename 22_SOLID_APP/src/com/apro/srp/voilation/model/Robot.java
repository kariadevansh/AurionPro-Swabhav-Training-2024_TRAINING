package com.apro.srp.voilation.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot Started Working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stopped Working");		
	}

	@Override
	public void eat() {
		System.out.println("not possible");
		
	}

	@Override
	public void drink() {
		System.out.println(" not possible");
		
	}
	
}
