package com.epex.shopskill.amunra.persistence.repository;

import com.epex.shopskill.amunra.persistence.entity.user.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInfoRepository extends MongoRepository<UserInfo,String> {
}
