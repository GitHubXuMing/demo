package com.company.service.iservice;

import com.company.dao.pojo.User;

import java.math.BigDecimal;

public interface UserService {
    String transSal(User src, User target, BigDecimal money);
    User findById(Integer id);
}
