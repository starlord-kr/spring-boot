package com.joochang.config;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username(dataSourceConfig.getUsername())
                .password(dataSourceConfig.getPassword())
                .url(dataSourceConfig.getUrl())
                .driverClassName(dataSourceConfig.getDriverClassName())
                .build();
    }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public PoolProperties getPoolProperties(){
        return new PoolProperties();
    }

    @Bean
    @Primary
    public DataSource dataSourceUsingPoolProperties() {
        PoolProperties properties = getPoolProperties();
        return DataSourceBuilder
                .create()
                .username(properties.getUsername())
                .password(properties.getPassword())
                .url(properties.getUrl())
                .driverClassName(properties.getDriverClassName())
                .build();
    }
}
