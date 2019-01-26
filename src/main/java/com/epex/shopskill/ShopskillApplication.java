package com.epex.shopskill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
public class ShopskillApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopskillApplication.class, args);
    }

}

