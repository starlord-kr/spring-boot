package com.joochang.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceBeanTest {

    @Autowired DataSourceBean dataSourceBean;

    @Test public void getPropertyTest() {

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        DataSource dataSource = dataSourceBean.dataSource();
        System.out.println("-- dataSource=" + dataSource.toString());

        try {
            Connection connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
