package com.apro.behavioural.state.model;

public interface IPacketState {
	void next(Packet packet);
	void previous(Packet packet);
	void packetStatus();
}
