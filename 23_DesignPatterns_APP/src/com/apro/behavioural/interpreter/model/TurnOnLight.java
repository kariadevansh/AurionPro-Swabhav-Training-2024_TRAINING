package com.apro.behavioural.interpreter.model;

public class TurnOnLight implements Expression {
    private String room;

    public TurnOnLight(String room) {
        this.room = room;
    }

    @Override
    public void interpret(Context context) {
        context.turnOnLight(room);
    }
}