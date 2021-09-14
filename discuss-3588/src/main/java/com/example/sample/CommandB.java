package com.example.sample;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CommandB extends CommandA {

    @TargetAggregateIdentifier
    public String id;

    public CommandB(String id) {
        super(id);
        this.id = id;
    }
}
