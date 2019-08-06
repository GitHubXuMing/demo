package com.company.dao;

import com.company.dao.pojo.Dept;
import com.company.dao.pojo.Student;
import com.company.dao.pojo.StudentM2M;

public interface ORMDao {
    //一对一映射
    Student findBySid(Integer sid);
    //一对多映射
    Dept findByDid(Integer did);
    //多对多映射
    StudentM2M findMany2Many(Integer sid);

}
