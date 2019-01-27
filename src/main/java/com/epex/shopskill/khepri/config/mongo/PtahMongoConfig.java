package com.epex.shopskill.khepri.config.mongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.epex.shopskill.amunra.persistence.repository",
        mongoTemplateRef = "ptahMongoTemplate")
public class PtahMongoConfig {
}
