package com.joochang.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * You can use prefix-alias,
 * maybe location-alias is older version's...
 *
 * ref) https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
 */
@Component
@ConfigurationProperties(prefix="person")
public class PersonnelProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
