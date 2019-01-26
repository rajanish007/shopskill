package com.epex.shopskill.osiris.controller.user;

import com.epex.shopskill.osiris.viewobject.UserRegistrationRequestVO;
import com.epex.shopskill.osiris.viewobject.UserRegistrationResponseVO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

    @RequestMapping(value = "/register/new", method = RequestMethod.POST)
    public UserRegistrationRequestVO createNewUser(@RequestBody @Valid UserRegistrationRequestVO registrationRequestVO,
                                                   HttpServletRequest request) {
        return registrationRequestVO;
    }

}
