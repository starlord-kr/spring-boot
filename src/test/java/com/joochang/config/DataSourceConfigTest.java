package com.joochang.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceConfigTest {

    @Autowired DataSourceConfig dataSourceConfig;

    @Test public void getPropertyTest() {

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        String username = dataSourceConfig.getUsername();
        System.out.println("-- username=" + username);

        String password = dataSourceConfig.getPassword();
        System.out.println("-- password=" + password);

        String url = dataSourceConfig.getUrl();
        System.out.println("-- url=" + url);

        String driverClassName = dataSourceConfig.getDriverClassName();
        System.out.println("-- driverClassName=" + driverClassName);

    }

}
