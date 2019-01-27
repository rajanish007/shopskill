package com.epex.shopskill.anubis.service.implementation;

import com.epex.shopskill.anubis.model.UserCredentialDto;
import com.epex.shopskill.anubis.persistence.entity.user.UserCredential;
import com.epex.shopskill.anubis.persistence.repository.UserCredentialRepository;
import com.epex.shopskill.anubis.service.mapper.UserMapper;
import com.epex.shopskill.anubis.service.prototype.UserCredentialManager;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialService implements UserCredentialManager {

    @Autowired
    private UserCredentialRepository credentialRepository;

    @Override
    public UserCredentialDto createUserCredential(UserCredentialDto userCredential) {
        UserCredential mappedEntity = UserMapper.map(userCredential);
        mappedEntity = credentialRepository.insert(mappedEntity);
        return UserMapper.map(mappedEntity);
    }

    @Override
    public UserCredentialDto updateUserCredential(UserCredentialDto userCredential) {
        return null;
    }

    @Override
    public UserCredentialDto getUserCredential(ObjectId nativeUserId) {
        return null;
    }

    @Override
    public void deleteUserCredential(ObjectId nativeUserId) {

    }
}
