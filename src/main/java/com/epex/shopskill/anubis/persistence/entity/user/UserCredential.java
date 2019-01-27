package com.epex.shopskill.anubis.persistence.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@AllArgsConstructor
@Document(collection = "maat_user_credential")
public class UserCredential {

    @Autowired
    public UserCredential() {
        Date now = new Date();
        this.creationDate = now.getTime();
        this.lastLoggedOn = now.getTime();
        this.isActive = false;
        this.passwordModifedOn = now.getTime();
    }

    @Id
    private String _id;

    @Setter
    private String userId;

    @Setter
    private String fullName;

    @Setter
    @Indexed(unique = true)
    private String email;

    private Long creationDate;

    private Long lastLoggedOn;

    private boolean isActive;

    @Setter
    private String password;

    @Setter
    private String encodedPassword;

    private Long passwordModifedOn;

}
