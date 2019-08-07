package com.company.service;

import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void transSal() {
        System.out.println(userService);
        User src = userService.findById(1);
        User target = userService.findById(2);
        String msg = userService.transSal(src,target,new BigDecimal("1000"));
        System.err.println("****************"+msg);
    }
}