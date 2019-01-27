package com.epex.shopskill.osiris.viewobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationResponseVO {

    private String userId;

    private String fullName;

    private String email;

}
