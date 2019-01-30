package com.epex.shopskill.osiris.controller;

import com.epex.shopskill.khepri.command.UserRegistrationCommand;
import com.epex.shopskill.khepri.command.handler.UserCommandsHandler;
import com.epex.shopskill.osiris.service.implementation.UserRequestProvider;
import com.epex.shopskill.osiris.viewobject.UserRegistrationRequestVO;
import com.epex.shopskill.osiris.viewobject.UserRegistrationResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

    @Autowired
    private UserCommandsHandler userCommandsHandler;

    @Autowired
    private UserRequestProvider userRequestProvider;

    @RequestMapping(value = "/register/new", method = RequestMethod.POST)
    public UserRegistrationResponseVO createNewUser(@RequestBody @Valid UserRegistrationRequestVO registrationRequestVO,
                                                    HttpServletRequest request) throws Exception {
        UserRegistrationResponseVO responseVO = userCommandsHandler.process(
                new UserRegistrationCommand(request.getHeader("uuid"), registrationRequestVO));
        return responseVO;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public UserRegistrationResponseVO findUser(@RequestParam("identifier") String identifier) {
        UserRegistrationResponseVO responseVO = userRequestProvider.getUserInfo(identifier);
        if (responseVO != null) return responseVO;
        throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,"User with identifier "+identifier+" not found !");
    }

}
