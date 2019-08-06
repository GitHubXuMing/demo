package com.company.dao;

import com.company.dao.pojo.Dept;
import com.company.dao.pojo.Score;
import com.company.dao.pojo.Student;
import com.company.dao.pojo.StudentM2M;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ORMDaoTest {
    @Autowired
    ORMDao ormDao;

    @Test
    public void findBySid() {
        System.err.println(ormDao);
        Student stu = ormDao.findBySid(1);
        System.err.println(stu.getSid()+":"+stu.getSname());
        System.err.println(stu.getDept());
    }

    @Test
    public void findByDid() {
        Dept dept = ormDao.findByDid(1);
        System.err.println(dept.getDname()+":");
        for(Student stu:dept.getStus()){
            System.err.println(stu.getSid()+"-->"+stu.getSname());
        }
    }

    @Test
    public void findMany2Many() {
        StudentM2M stu = ormDao.findMany2Many(1);
        System.err.println(stu.getSname()+"'s score:");
        for(Score score:stu.getScores()){
            System.err.println(score.getCourse().getCname()+":"+score.getScore());
        }
    }
}