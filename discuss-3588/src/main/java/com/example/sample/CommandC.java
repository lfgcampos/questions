package com.example.sample;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CommandC extends CommandB {

    @TargetAggregateIdentifier
    public String id;

    public CommandC(String id) {
        super(id);
        this.id = id;
    }
}
