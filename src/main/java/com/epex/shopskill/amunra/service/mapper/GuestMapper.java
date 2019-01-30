package com.epex.shopskill.amunra.service.mapper;

import com.epex.shopskill.amunra.model.GuestInfoDto;
import com.epex.shopskill.amunra.persistence.entity.guest.GuestInfo;

public class GuestMapper {

    public static GuestInfoDto map(GuestInfo entity) {
        GuestInfoDto dto = new GuestInfoDto();
        dto.set_id(entity.get_id());
        dto.setIpAddress(entity.getIpAddress());
        dto.setLastLogOffTime(entity.getLastLogOffTime());
        dto.setLastVisitedOn(entity.getLastVisitedOn());
        return dto;
    }

    public static GuestInfo map(GuestInfoDto dto) {
        GuestInfo entity = new GuestInfo();
        entity.set_id(dto.get_id());
        entity.setIpAddress(dto.getIpAddress());
        entity.setLastLogOffTime(dto.getLastLogOffTime());
        entity.setLastVisitedOn(dto.getLastVisitedOn());
        return entity;
    }

}
