package com.epex.shopskill.amunra.persistence.repository;

import com.epex.shopskill.amunra.persistence.entity.user.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserInfoRepository extends CrudRepository<UserInfo,String> {

    public Optional<UserInfo> findByUserIdOrEmail(String userId,String email);

}
