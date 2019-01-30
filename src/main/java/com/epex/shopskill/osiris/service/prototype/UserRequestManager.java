package com.epex.shopskill.osiris.service.prototype;

import com.epex.shopskill.osiris.viewobject.UserRegistrationResponseVO;

/**
 * Don't disclose any service for data modification
 */
public interface UserRequestManager {

    public UserRegistrationResponseVO getUserInfo(String identifier);

}
