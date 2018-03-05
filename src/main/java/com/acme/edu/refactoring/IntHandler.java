package com.acme.edu.refactoring;

public abstract class IntHandler extends LoggerHandler {
    Command[] commands = new Command[10_000];

    @Override
    public void handle(Object message) {
        for (Command current : commands) {
            current.decorate().toUpperCase();
        }


        if (message instanceof String) {
            //responsibility: switch -> polym
            ((String)message).toUpperCase();
        } else {

        }

//        message.execute();

    }
}
