package com.apro.srp.solutions.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot Started Working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stopped Working");		
	}

	
}
