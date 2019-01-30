package com.epex.shopskill.amunra.persistence.repository;

import com.epex.shopskill.amunra.persistence.entity.guest.GuestInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GuestInfoRepository extends MongoRepository<GuestInfo, String> {

    Optional<GuestInfo> findByIpAddress(String ipAddress);

}
