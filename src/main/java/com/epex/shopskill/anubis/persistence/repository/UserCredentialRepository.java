package com.epex.shopskill.anubis.persistence.repository;

import com.epex.shopskill.anubis.persistence.entity.user.UserCredential;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserCredentialRepository extends MongoRepository<UserCredential, String> {

}
