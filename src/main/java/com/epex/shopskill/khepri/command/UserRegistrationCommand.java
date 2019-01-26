package com.epex.shopskill.khepri.command;

import com.epex.shopskill.osiris.viewobject.UserRegistrationRequestVO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@AllArgsConstructor
public class UserRegistrationCommand extends Command {

    private UserRegistrationRequestVO payload;

    private Logger logger = LoggerFactory.getLogger(UserRegistrationRequestVO.class);

    public UserRegistrationCommand(UUID transactionId, UserRegistrationRequestVO payload) {
        super(transactionId);
        this.payload = payload;
        logger.info(this.toString());
    }

    @Override
    public String toString() {
        return "UserRegistrationCommand{" +
                "payload=" + payload +
                "} " + super.toString();
    }
}
