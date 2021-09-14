package com.example.sample;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CreateAggregateCommand {

    @TargetAggregateIdentifier
    public String id;

    public CreateAggregateCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
