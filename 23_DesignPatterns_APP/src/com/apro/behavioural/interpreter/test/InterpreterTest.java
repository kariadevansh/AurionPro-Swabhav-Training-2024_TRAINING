package com.apro.behavioural.interpreter.test;

import com.apro.behavioural.interpreter.model.Context;
import com.apro.behavioural.interpreter.model.Expression;
import com.apro.behavioural.interpreter.model.SetThermostat;
import com.apro.behavioural.interpreter.model.TurnOffLight;
import com.apro.behavioural.interpreter.model.TurnOnLight;

public class InterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();

        Expression livingRoomLightOn = new TurnOnLight("living room");
        Expression kitchenLightOff = new TurnOffLight("kitchen");
        Expression setThermostat = new SetThermostat(72);

        livingRoomLightOn.interpret(context);  
        kitchenLightOff.interpret(context);    
        setThermostat.interpret(context);      
    }
}

