package com.joochang.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * You can use prefix-alias,
 * maybe location-alias is older version's...
 *
 * Same @ConfigurationProperties(prefix="person") and @ConfigurationProperties("person")
 *
 * ref) https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
 */
@Component
//@ConfigurationProperties(prefix="person")
@ConfigurationProperties("person")
public class PersonnelConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
