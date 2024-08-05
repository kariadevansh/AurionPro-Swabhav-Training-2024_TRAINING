package com.apro.behavioural.command.model;

public class RemoteControl {
    private ICommand command;
 
    public void setCommand(ICommand command) {
        this.command = command;
    }
 
    public void pressButton() {
        command.execute();
    }
}
