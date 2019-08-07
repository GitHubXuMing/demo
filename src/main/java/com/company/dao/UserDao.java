package com.company.dao;

import com.company.dao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    User findById(@Param("userId") Integer userId,@Param("random") Double random);
    List<User> findAll();
    List<User> findByName(@Param("username") String username);
    int save(User user);
    int saveAutoIncrement(User user);
    int update(User user);
    int delete(Integer userId);
    List<User> findByPage2(@Param("begin") int begin,@Param("size") int size);
}
