package com.apro.behavioural.state.test;

import java.util.Scanner;

import com.apro.behavioural.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet();
		
		packet.currentState();
		Scanner scanner = new Scanner(System.in);
		
		menuDriver(scanner,packet);
		scanner.close();
	}
	
	private static void menuDriver(Scanner scanner, Packet packet) {
		
		boolean flag =true;
		while(flag) {
			System.out.println("1.Current state\n2.Next state\n3.Previous state\n4.Exit");
			int choice = scanner.nextInt();
			switch(choice){
			case 1:
				packet.currentState();
				break;
			case 2:
				packet.nextState();
				break;
			case 3:
				packet.previousState();
				break;
			case 4: 
				System.out.println("Exit");
				flag = false;
				break;
			default:
				System.out.println("\nselect a valid option");
				break;
			}
		}

	}
}
