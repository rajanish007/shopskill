package com.epex.shopskill.khepri.command.handler;

import com.epex.shopskill.amunra.model.UserInfoDto;
import com.epex.shopskill.amunra.service.implementation.UserInfoService;
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

    @Autowired
    private UserInfoService userInfoService;

    private final Logger logger = LoggerFactory.getLogger(UserCommandsHandler.class);

    public UserRegistrationResponseVO process(UserRegistrationCommand command) throws MalformedInputException {
        UserCredentialDto credentialDto = new UserCredentialDto();
        credentialDto.setUserId(command.getPayload().getUserId());
        credentialDto.setFullName(command.getPayload().getFullName());
        credentialDto.setEmail(command.getPayload().getEmail());
        credentialDto.setPassword(command.getPayload().getPassword());
        credentialDto.setEncodedPassword(Encryption.encode(command.getPayload().getPassword()));
        credentialDto = userCredentialService.createUserCredential(credentialDto);
        logger.info("User credential created for user : " + credentialDto.toString());

        UserInfoDto infoDto = new UserInfoDto();
        infoDto.setUserId(command.getPayload().getUserId());
        infoDto.setFullName(command.getPayload().getFullName());
        infoDto.setEmail(command.getPayload().getEmail());
        infoDto.setDob(command.getPayload().getDob());
        infoDto = userInfoService.createUserInfo(infoDto);
        logger.info("User info created for user : " + infoDto.toString());

        UserRegistrationResponseVO responseVO = new UserRegistrationResponseVO();
        responseVO.setEmail(credentialDto.getEmail());
        responseVO.setFullName(credentialDto.getFullName());
        responseVO.setUserId(credentialDto.getUserId());
        responseVO.setDob(infoDto.getDob());
        return responseVO;
    }

}
