package com.epex.shopskill.amunra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestInfoDto {

    private String _id;

    private Long lastVisitedOn;
    private Long lastLogOffTime;

    private String ipAddress;

}
