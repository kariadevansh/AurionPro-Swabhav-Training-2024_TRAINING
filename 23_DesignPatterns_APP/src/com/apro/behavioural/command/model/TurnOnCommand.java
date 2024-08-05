package com.apro.behavioural.command.model;

public class TurnOnCommand implements ICommand{
	private IDevice device;
	
    public TurnOnCommand(IDevice device) {
        this.device = device;
    }
 
    @Override
    public void execute() {
        device.turnOn();
    }

}
