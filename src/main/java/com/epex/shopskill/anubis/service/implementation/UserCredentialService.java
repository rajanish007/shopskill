package com.epex.shopskill.anubis.service.implementation;

import com.epex.shopskill.anubis.model.UserCredentialDto;
import com.epex.shopskill.anubis.persistence.entity.user.UserCredential;
import com.epex.shopskill.anubis.persistence.repository.UserCredentialRepository;
import com.epex.shopskill.anubis.service.mapper.UserSecurityMapper;
import com.epex.shopskill.anubis.service.prototype.UserCredentialManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCredentialService implements UserCredentialManager {

    @Autowired
    private UserCredentialRepository credentialRepository;

    @Override
    public UserCredentialDto createUserCredential(UserCredentialDto userCredential) {
        UserCredential mappedEntity = UserSecurityMapper.map(userCredential);
        mappedEntity = credentialRepository.save(mappedEntity);
        return UserSecurityMapper.map(mappedEntity);
    }

    @Override
    public UserCredentialDto updateUserCredential(UserCredentialDto userCredential) {
        UserCredential persistedCredential = credentialRepository.findByUserId(userCredential.getUserId());
        if (persistedCredential != null) {
            userCredential.set_id(persistedCredential.get_id());
            UserCredential mappedEntity = UserSecurityMapper.map(userCredential);
            mappedEntity = credentialRepository.save(mappedEntity);
            return UserSecurityMapper.map(mappedEntity);
        } else {
            throw new IllegalArgumentException("User with userId = " + userCredential.getUserId() + " does not exist !\n");
        }
    }

    @Override
    public UserCredentialDto getUserCredential(String nativeUserId) {
        Optional<UserCredential> persistedCredential = credentialRepository.findById(nativeUserId);
        if (persistedCredential != null) {
            return UserSecurityMapper.map(persistedCredential.get());
        } else {
            throw new IllegalArgumentException("User with native Id = " + nativeUserId + " does not exist !\n");
        }
    }

    @Override
    public void deleteUserCredential(String nativeUserId) {
        Optional<UserCredential> persistedCredential = credentialRepository.findById(nativeUserId);
        try {
            credentialRepository.delete(persistedCredential.get());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("User with native Id = " + nativeUserId + " does not exist !\n");
        }
    }
}
