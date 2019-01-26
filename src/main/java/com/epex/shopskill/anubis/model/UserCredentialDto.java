package com.epex.shopskill.anubis.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserCredentialDto {

    private ObjectId _id;

    private String userId;
    private String name;

    private String email;

    private Date creationDate;
    private Date lastLoggedOn;
    private boolean isActive;

    private String password;
    private String encodedPassword;
    private Date passwordModifedOn;

}
