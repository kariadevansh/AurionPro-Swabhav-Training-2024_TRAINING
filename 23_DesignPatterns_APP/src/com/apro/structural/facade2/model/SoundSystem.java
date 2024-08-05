package com.apro.structural.facade2.model;

public class SoundSystem implements IMachine{

	@Override
	public void on() {
		System.out.println("SoundSystem is Active");		
	}
	
	public void setVolume(double volumeLevel) {
		System.out.println("Volume :"+volumeLevel);
	}

}
