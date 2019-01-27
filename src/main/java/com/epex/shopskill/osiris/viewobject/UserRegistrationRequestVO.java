package com.epex.shopskill.osiris.viewobject;

import com.epex.shopskill.khepri.annotation.ValidEmail;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserRegistrationRequestVO {

    @NotNull
    @Size(min = 6, max = 20)
    @Valid
    private String userId;

    @NotNull
    @Valid
    private String fullName;

    @NotNull
    @ValidEmail
    private String email;

    @NotNull
    @Size(min = 6, max = 14)
    private String password;

}
