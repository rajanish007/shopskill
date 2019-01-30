package com.epex.shopskill.amunra.service.implementation;

import com.epex.shopskill.amunra.model.UserInfoDto;
import com.epex.shopskill.amunra.persistence.entity.user.UserInfo;
import com.epex.shopskill.amunra.persistence.repository.UserInfoRepository;
import com.epex.shopskill.amunra.service.mapper.UserDetailMapper;
import com.epex.shopskill.amunra.service.prototype.UserInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService implements UserInfoManager {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfoDto getUserInfo(String identifier) {
        Optional<UserInfo> userInfo = userInfoRepository.findByUserIdOrEmail(identifier,identifier);
        if (userInfo.isPresent()) {
            return UserDetailMapper.map(userInfo.get());
        }
        return null;
    }

    @Override
    public UserInfoDto createUserInfo(UserInfoDto userInfoDto) {
        Optional<UserInfo> userInfo = userInfoRepository.findByUserIdOrEmail(userInfoDto.getUserId(),userInfoDto.getEmail());
        if (userInfo.isPresent()) {
            return updateUserInfo(userInfoDto);
        }
        return UserDetailMapper.map(userInfoRepository.save(UserDetailMapper.map(userInfoDto)));
    }

    @Override
    public UserInfoDto updateUserInfo(UserInfoDto userInfoDto) {
        return UserDetailMapper.map(userInfoRepository.save(UserDetailMapper.map(userInfoDto)));
    }

    @Override
    public void deleteUserInfo(String identifier) {
        userInfoRepository.delete(userInfoRepository.findByUserIdOrEmail(identifier,identifier).get());
    }
}
