package com.epex.shopskill.amunra.persistence.entity.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "ptah_user_detail")
public class UserInfo {

    @Id
    private String _id;

    /*User Related Fields */
    private String userId;
    private String fullName;

    @Indexed(unique = true)
    private String email;
    private String dob;

}
