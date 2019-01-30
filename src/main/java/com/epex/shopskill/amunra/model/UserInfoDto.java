package com.epex.shopskill.amunra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {

    private String _id;

    private String userId;
    private String fullName;

    private String email;
    private Long dob;
}
