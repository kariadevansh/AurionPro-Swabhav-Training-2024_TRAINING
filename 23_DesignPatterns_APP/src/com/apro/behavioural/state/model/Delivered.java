package com.apro.behavioural.state.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		System.out.println("Packet is already delivered");	
	}

	@Override
	public void previous(Packet packet) {
		IPacketState state = new Shipped();
		packet.setState(state);
		System.out.println("\nPacke moved to Shipped state");
	}

	@Override
	public void packetStatus() {
		System.out.println("Packet is currently in Ordered state");
	}
	
}
