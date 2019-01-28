package com.epex.shopskill.osiris.controller.user;

import com.epex.shopskill.khepri.command.UserRegistrationCommand;
import com.epex.shopskill.khepri.command.handler.UserCommandsHandler;
import com.epex.shopskill.osiris.viewobject.UserRegistrationRequestVO;
import com.epex.shopskill.osiris.viewobject.UserRegistrationResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

    @Autowired
    UserCommandsHandler userCommandsHandler;

    @RequestMapping(value = "/register/new", method = RequestMethod.POST)
    public UserRegistrationResponseVO createNewUser(@RequestBody @Valid UserRegistrationRequestVO registrationRequestVO,
                                                    HttpServletRequest request) throws Exception {
        UserRegistrationResponseVO responseVO = userCommandsHandler.userRegistrationHandler(
                new UserRegistrationCommand(request.getHeader("uuid"), registrationRequestVO));
        return responseVO;
    }

}
