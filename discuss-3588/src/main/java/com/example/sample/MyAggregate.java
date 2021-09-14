package com.example.sample;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class MyAggregate {

    @AggregateIdentifier
    private String id;

    public MyAggregate() {
    }

    @CommandHandler
    public MyAggregate(CreateAggregateCommand command) {
        apply(new AggregatedCreatedEvent(command.getId()));
    }

    @EventSourcingHandler
    public void on(AggregatedCreatedEvent event) {
        id = event.getId();
    }

    @CommandHandler
    public void on(CommandA cmd) {
        System.out.println("Handled CommandA");
        apply(new CommandHandledEvent("CommandA"));
    }

    @CommandHandler
    public void on(CommandB cmd) {
        System.out.println("Handled CommandB");
        apply(new CommandHandledEvent("CommandB"));
    }

    @CommandHandler
    public void on(CommandC cmd) {
        System.out.println("Handled CommandC");
        apply(new CommandHandledEvent("CommandC"));
    }
}
