package com.apro.structural.facade2.model;

public class MovieFacade {
	public void dvdPlayerFunctions() {
		DvdPlayer dvdPlayer = new DvdPlayer();
		dvdPlayer.on();
		dvdPlayer.setMovie("Jaws");
	}
	
	public void soundSystemFunctions() {
		SoundSystem soundSystem = new  SoundSystem();
		soundSystem.on();
		soundSystem.setVolume(7.5);
	}
	
	public void projectorFunctions() {
		Projector projector = new Projector();
		projector.on();
	}
}
