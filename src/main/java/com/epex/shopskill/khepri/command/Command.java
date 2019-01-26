package com.epex.shopskill.khepri.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@Getter
@ToString
@NoArgsConstructor
public abstract class Command {

    private UUID commandId;

    private UUID transactionId;

    Command(UUID transactionId){
        this.commandId = UUID.randomUUID();
        this.transactionId = transactionId;
    }
}
