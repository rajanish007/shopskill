package com.epex.shopskill.amunra.persistence.entity.guest;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "ptah_guest_detail")
public class GuestInfo {

    @Id
    private String _id;

    private Long lastVisitedOn;
    private Long lastLogOffTime;

    private String ipAddress;

    //TODO Add one to many mapping field for features he accessed
}
