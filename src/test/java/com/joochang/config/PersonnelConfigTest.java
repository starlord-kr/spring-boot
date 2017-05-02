package com.joochang.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonnelConfigTest {

    @Autowired
    PersonnelConfig personnelConfig;

    @Test public void getPropertyTest() {

        String name = personnelConfig.getName();
        System.out.println("-- name=" + name);

    }

}
