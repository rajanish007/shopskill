package com.epex.shopskill.khepri.config.mongo;

import lombok.Data;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

    private MongoProperties maat = new MongoProperties();
    private MongoProperties ptah = new MongoProperties();
}
