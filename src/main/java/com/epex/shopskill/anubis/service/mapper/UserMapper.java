package com.epex.shopskill.anubis.service.mapper;

import com.epex.shopskill.anubis.model.UserCredentialDto;
import com.epex.shopskill.anubis.persistence.entity.user.UserCredential;

public class UserMapper {

    public static UserCredentialDto map(UserCredential entity) {
        UserCredentialDto dto = new UserCredentialDto();
        dto.set_id(entity.get_id());
        dto.setActive(entity.isActive());
        dto.setCreationDate(entity.getCreationDate());
        dto.setEmail(entity.getEmail());
        dto.setEncodedPassword(entity.getEncodedPassword());
        dto.setLastLoggedOn(entity.getLastLoggedOn());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setPasswordModifedOn(entity.getPasswordModifedOn());
        dto.setUserId(entity.getUserId());
        return dto;
    }

    public static UserCredential map(UserCredentialDto dto){
        UserCredential entity = new UserCredential();
        entity.set_id(dto.get_id());
        entity.setActive(dto.isActive());
        entity.setCreationDate(dto.getCreationDate());
        entity.setEmail(dto.getEmail());
        entity.setEncodedPassword(dto.getEncodedPassword());
        entity.setLastLoggedOn(dto.getLastLoggedOn());
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setPasswordModifedOn(dto.getPasswordModifedOn());
        entity.setUserId(dto.getUserId());
        return entity;
    }

}
