package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.UserDao;
import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(long userId) {
        return userDao.queryUserById(userId);
    }

    @Override
    public int queryUserIdByUserName(String username) {
        return userDao.queryUserIdByUserName(username);
    }

    @Override
    public User queryUserNameByUserName(String username) {
        return userDao.queryUserNameByUserName(username);
    }


}
