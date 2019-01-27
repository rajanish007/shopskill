package com.epex.shopskill.khepri.command.handler;

import com.epex.shopskill.anubis.model.UserCredentialDto;
import com.epex.shopskill.anubis.service.implementation.UserCredentialService;
import com.epex.shopskill.khepri.command.UserRegistrationCommand;
import com.epex.shopskill.khepri.config.security.Encryption;
import com.epex.shopskill.osiris.viewobject.UserRegistrationResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.MalformedInputException;

@Service
public class UserCommandsHandler {

    @Autowired
    private UserCredentialService userCredentialService;

    private final Logger logger = LoggerFactory.getLogger(UserCommandsHandler.class);

    public UserRegistrationResponseVO userRegistrationHandler(UserRegistrationCommand command) throws MalformedInputException {
        UserCredentialDto credentialDto = new UserCredentialDto();
        UserRegistrationResponseVO responseVO = new UserRegistrationResponseVO();

        credentialDto.setUserId(command.getPayload().getUserId());
        credentialDto.setFullName(command.getPayload().getFullName());
        credentialDto.setEmail(command.getPayload().getEmail());
        credentialDto.setPassword(command.getPayload().getPassword());
        credentialDto.setEncodedPassword(Encryption.encode(command.getPayload().getPassword()));

        credentialDto = userCredentialService.createUserCredential(credentialDto);
        responseVO.setEmail(credentialDto.getEmail());
        responseVO.setFullName(credentialDto.getFullName());
        responseVO.setUserId(credentialDto.getUserId());
        return responseVO;
    }

}
