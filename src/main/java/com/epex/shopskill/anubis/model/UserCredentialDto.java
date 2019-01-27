package com.epex.shopskill.anubis.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserCredentialDto {

    private String _id;

    private String userId;
    private String fullName;

    private String email;

    private Date creationDate;
    private Date lastLoggedOn;
    private boolean isActive;

    private String password;
    private String encodedPassword;
    private Date passwordModifedOn;

}
