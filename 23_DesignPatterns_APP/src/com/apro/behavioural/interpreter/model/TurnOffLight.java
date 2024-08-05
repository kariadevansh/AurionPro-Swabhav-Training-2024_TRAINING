package com.apro.behavioural.interpreter.model;

public class TurnOffLight implements Expression {
    private String room;

    public TurnOffLight(String room) {
        this.room = room;
    }

    @Override
    public void interpret(Context context) {
        context.turnOffLight(room);
    }
}