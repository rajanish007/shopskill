package com.epex.shopskill.osiris.service.implementation;

import com.epex.shopskill.amunra.model.UserInfoDto;
import com.epex.shopskill.amunra.service.implementation.UserInfoService;
import com.epex.shopskill.osiris.service.prototype.UserRequestManager;
import com.epex.shopskill.osiris.viewobject.UserRegistrationResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRequestProvider implements UserRequestManager {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserRegistrationResponseVO getUserInfo(String identifier) {
        UserInfoDto userInfoDto = userInfoService.getUserInfo(identifier);
        if(userInfoDto != null){
            UserRegistrationResponseVO responseVO = new UserRegistrationResponseVO();
            responseVO.setDob(userInfoDto.getDob());
            responseVO.setUserId(userInfoDto.getUserId());
            responseVO.setFullName(userInfoDto.getFullName());
            responseVO.setEmail(userInfoDto.getEmail());
            return responseVO;
        }
        return null;
    }
}
