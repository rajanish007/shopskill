package com.epex.shopskill.anubis.service.mapper;

import com.epex.shopskill.anubis.model.UserCredentialDto;
import com.epex.shopskill.anubis.persistence.entity.user.UserCredential;

import java.util.Date;

public class UserSecurityMapper {

    public static UserCredentialDto map(UserCredential entity) {
        UserCredentialDto dto = new UserCredentialDto();
        dto.set_id(entity.get_id());
        dto.setActive(entity.isActive());
        dto.setCreationDate(new Date(entity.getCreationDate()));
        dto.setEmail(entity.getEmail());
        dto.setEncodedPassword(entity.getEncodedPassword());
        dto.setLastLoggedOn(new Date(entity.getLastLoggedOn()));
        dto.setFullName(entity.getFullName());
        dto.setPassword(entity.getPassword());
        dto.setPasswordModifedOn(new Date(entity.getPasswordModifedOn()));
        dto.setUserId(entity.getUserId());
        return dto;
    }

    public static UserCredential map(UserCredentialDto dto) {
        UserCredential entity = new UserCredential();
        entity.setEmail(dto.getEmail());
        entity.setEncodedPassword(dto.getEncodedPassword());
        entity.setFullName(dto.getFullName());
        entity.setPassword(dto.getPassword());
        entity.setUserId(dto.getUserId());
        return entity;
    }

}
