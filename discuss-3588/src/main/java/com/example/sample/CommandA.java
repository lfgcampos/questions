package com.example.sample;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CommandA {

    @TargetAggregateIdentifier
    public String id;

    public CommandA(String id) {
        this.id = id;
    }
}
