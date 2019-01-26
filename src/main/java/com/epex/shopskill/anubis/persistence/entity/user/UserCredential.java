package com.epex.shopskill.anubis.persistence.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "maat_user_credential")
public class UserCredential extends AbstractMongoEventListener<UserCredential> {

    private ObjectId _id;

    private String userId;
    private String name;

    @Indexed(unique = true)
    private String email;

    private Date creationDate;
    private Date lastLoggedOn;
    private boolean isActive;

    private String password;
    private String encodedPassword;
    private Date passwordModifedOn;

    @Override
    public void onBeforeSave(BeforeSaveEvent<UserCredential> event) {
        UserCredential source = event.getSource();
        Date now = new Date();
        source.setCreationDate(now);
        source.setLastLoggedOn(now);
        source.setActive(false);
        source.setEncodedPassword(source.getPassword());
        source.setPasswordModifedOn(now);
    }
}
