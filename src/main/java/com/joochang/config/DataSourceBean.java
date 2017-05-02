package com.joochang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceBean {

    private final DataSourceConfig dataSourceConfig;

    @Autowired public DataSourceBean(@SuppressWarnings("SpringJavaAutowiringInspection")
                                     DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username(dataSourceConfig.getUsername())
                .password(dataSourceConfig.getPassword())
                .url(dataSourceConfig.getUrl())
                .driverClassName(dataSourceConfig.getDriverClassName())
                .build();
    }
}
