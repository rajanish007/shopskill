package com.epex.shopskill.amunra.service.prototype;

import com.epex.shopskill.amunra.model.GuestInfoDto;

public interface GuestInfoManager {

    public GuestInfoDto getGuestInfo(String guestId);

    public GuestInfoDto createGustInfo(GuestInfoDto guestInfoDto);

    public GuestInfoDto updateGuestInfo(GuestInfoDto guestInfoDto);

    public void deleteGuestInfo(String guestId);

}
