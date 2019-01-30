package com.epex.shopskill.amunra.service.mapper;

import com.epex.shopskill.amunra.model.UserInfoDto;
import com.epex.shopskill.amunra.persistence.entity.user.UserInfo;

public class UserDetailMapper {

    public static UserInfoDto map(UserInfo entity){
        UserInfoDto dto = new UserInfoDto();
        dto.set_id(entity.get_id());
        dto.setDob(entity.getDob());
        dto.setEmail(entity.getEmail());
        dto.setFullName(entity.getFullName());
        dto.setUserId(entity.getUserId());
        return dto;
    }

    public static UserInfo map(UserInfoDto dto){
        UserInfo entity = new UserInfo();
        entity.set_id(dto.get_id());
        entity.setDob(dto.getDob());
        entity.setEmail(dto.getEmail());
        entity.setFullName(dto.getFullName());
        entity.setUserId(dto.getUserId());
        return entity;
    }

}
