package com.apro.behavioural.state.model;

public class Packet {
	private IPacketState state;

	public Packet() {
		this.state = new Ordered();
	}

	public IPacketState getState() {
		return state;
	}

	public void setState(IPacketState state) {
		this.state = state;
	}
	
	public void nextState() {
		state.next(this);
	}
	
	public void previousState() {
		state.previous(this);
	}
	
	public void currentState() {
		state.packetStatus();
	}
	
	
}
