package com.epex.shopskill.amunra.service.implementation;

import com.epex.shopskill.amunra.model.GuestInfoDto;
import com.epex.shopskill.amunra.persistence.entity.guest.GuestInfo;
import com.epex.shopskill.amunra.persistence.repository.GuestInfoRepository;
import com.epex.shopskill.amunra.service.mapper.GuestMapper;
import com.epex.shopskill.amunra.service.prototype.GuestInfoManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GuestInfoService implements GuestInfoManager {

    @Autowired
    private GuestInfoRepository guestInfoRepository;

    @Override
    public GuestInfoDto getGuestInfo(String ipAddress) {
        Optional<GuestInfo> guestInfo = guestInfoRepository.findByIpAddress(ipAddress);
        if (guestInfo.isPresent()) {
            return GuestMapper.map(guestInfo.get());
        }
        return null;
    }

    @Override
    public GuestInfoDto createGuestInfo(GuestInfoDto guestInfoDto) {
        Optional<GuestInfo> guestInfo = guestInfoRepository.findByIpAddress(guestInfoDto.getIpAddress());
        if (guestInfo.isPresent()) {
            return updateGuestInfo(guestInfoDto);
        } else {
            return GuestMapper.map(guestInfoRepository.save(GuestMapper.map(guestInfoDto)));
        }
    }

    @Override
    public GuestInfoDto updateGuestInfo(GuestInfoDto guestInfoDto) {
        return GuestMapper.map(guestInfoRepository.save(GuestMapper.map(guestInfoDto)));
    }

    @Override
    public void deleteGuestInfo(String guestId) {
    }
}
