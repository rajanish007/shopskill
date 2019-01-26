package com.epex.shopskill.config.mongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.epex.shopskill.config.persistence.repository.ptah",
        mongoTemplateRef = "ptahMongoTemplate")
public class PtahMongoConfig {
}
