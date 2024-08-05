package com.apro.behavioural.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		IPacketState state = new Shipped();
		packet.setState(state);
		System.out.println("\nPacke moved to Shipped state");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("\nPacket is already in Ordered");		
	}

	@Override
	public void packetStatus() {
		System.out.println("\nPacket is currently in Ordered state");
	}
	
}
