package com.epex.shopskill.amunra.service.prototype;

import com.epex.shopskill.amunra.model.UserInfoDto;

public interface UserInfoManager {

    public UserInfoDto getUserInfo(String userId);

    public UserInfoDto createUserInfo(UserInfoDto userInfoDto);

    public UserInfoDto updateUserInfo(UserInfoDto userInfoDto);

    public void deleteUserInfo(String userId);

}
