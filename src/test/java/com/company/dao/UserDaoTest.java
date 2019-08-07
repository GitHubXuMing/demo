package com.company.dao;

import com.company.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void findById() {
        User user = userDao.findById(2,new Random().nextDouble());

        System.err.println("1:"+user);

        System.err.println("2:"+userDao.findById(2,new Random().nextDouble()));
    }

    @Test
    public void findAll() {
        for(User user:userDao.findAll()){
            System.err.println(user);
        }
    }

    @Test
    public void findByName() {
        for(User user:userDao.findByName("a")){
            System.err.println(user);
        }
    }

    @Test
    public void save() {
        User user = new User(6,"zheng",new BigDecimal("99999"),new Date());
        int result = userDao.save(user);
        System.err.println(result>0?"save success":"save error");
        findAll();
    }
    @Test
    public void update() {
        User user = new User(1,"ZHAO**",new BigDecimal("99999"),new Date());
        int result = userDao.update(user);
        System.err.println(result>0?"update success":"update error");
        findAll();
    }

    @Test
    public void delete() {
        findAll();
        int result = userDao.delete(7);
        System.err.println(result>0?"delete success":"delete error");
        findAll();
    }

    @Test
    public void findByPage2(){
        for(User user:userDao.findByPage2(1,4)){
            System.err.println(user);
        }
    }
}