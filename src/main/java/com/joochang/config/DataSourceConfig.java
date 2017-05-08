package com.joochang.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;

@Configuration
@ConfigurationProperties(prefix="spring.datasource")
public class DataSourceConfig {

    private String username;
    private String password;
    private String url;
    private String driverClassName;

    @Valid
    private final Tomcat tomcat = new Tomcat();


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }


    public Tomcat getTomcat() {
        return tomcat;
    }


    public class Tomcat {

        private String minIdle;

        public String getMinIdle() {
            return minIdle;
        }

        public void setMinIdle(String minIdle) {
            this.minIdle = minIdle;
        }

    }

}
