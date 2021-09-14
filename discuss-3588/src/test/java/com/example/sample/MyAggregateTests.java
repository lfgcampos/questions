package com.example.sample;

import org.axonframework.test.aggregate.AggregateTestFixture;
import org.junit.jupiter.api.*;

import java.util.UUID;

class MyAggregateTests {

    private AggregateTestFixture<MyAggregate> testFixture;

    @BeforeEach
    void setUp() {
        testFixture = new AggregateTestFixture<>(MyAggregate.class);
    }

    @Test
    void testCommandA() {
        String id = UUID.randomUUID().toString();
        testFixture.givenCommands(new CreateAggregateCommand(id))
                   .when(new CommandA(id))
                   .expectEvents(new CommandHandledEvent("CommandA"));
    }

    @Test
    void testCommandB() {
        String id = UUID.randomUUID().toString();
        testFixture.givenCommands(new CreateAggregateCommand(id))
                   .when(new CommandB(id))
                   .expectEvents(new CommandHandledEvent("CommandB"));
    }

    @Test
    void testCommandC() {
        String id = UUID.randomUUID().toString();
        testFixture.givenCommands(new CreateAggregateCommand(id))
                   .when(new CommandC(id))
                   .expectEvents(new CommandHandledEvent("CommandC"));
    }
}
