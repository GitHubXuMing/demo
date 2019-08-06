package com.company.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {
    @Autowired
    UserService userService;
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);
    @Test
    public void findById() {
        System.err.println(userService.findById(1));
    }
}