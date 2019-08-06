package com.company.service;

import com.company.dao.pojo.User;

public interface UserService {
    User findById(Integer userId);
}
