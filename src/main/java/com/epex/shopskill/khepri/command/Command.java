package com.epex.shopskill.khepri.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@NoArgsConstructor
public abstract class Command {

    private String commandId;

    private String transactionId;

    Command(String transactionId) {
        this.commandId = UUID.randomUUID().toString();
        this.transactionId = transactionId;
    }
}
