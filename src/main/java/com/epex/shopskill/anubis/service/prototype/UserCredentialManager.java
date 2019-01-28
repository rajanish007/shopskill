package com.epex.shopskill.anubis.service.prototype;

import com.epex.shopskill.anubis.model.UserCredentialDto;
import org.bson.types.ObjectId;

public interface UserCredentialManager {

    public UserCredentialDto createUserCredential(UserCredentialDto userCredential);

    public UserCredentialDto updateUserCredential(UserCredentialDto userCredential);

    public UserCredentialDto getUserCredential(String nativeUserId);

    public void deleteUserCredential(String nativeUserId);

}
