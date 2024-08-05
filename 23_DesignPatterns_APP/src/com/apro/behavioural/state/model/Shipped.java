package com.apro.behavioural.state.model;

public class Shipped implements IPacketState{

	@Override
	public void next(Packet packet) {
		IPacketState state = new Delivered();
		packet.setState(state);
		System.out.println("\nPacke moved to Delivered state");
	}

	@Override
	public void previous(Packet packet) {
		IPacketState state = new Ordered();
		packet.setState(state);
		System.out.println("\nPacke moved to Ordered state");
	}

	@Override
	public void packetStatus() {
		System.out.println("\nPacket is currently in Shipped state");
	}
	
}
