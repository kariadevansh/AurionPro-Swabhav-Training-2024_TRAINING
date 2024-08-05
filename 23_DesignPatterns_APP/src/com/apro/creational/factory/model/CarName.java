package com.apro.creational.factory.model;

public enum CarName {
	MARUTI,TATA,MAHINDRA;
	
	public String toString() {
		switch(this) {
		case MARUTI : return "MARUTI";
		case TATA: return "TATA";
		case MAHINDRA:return "MAHINDRA";
		default: return "none";
		}
	}
}
