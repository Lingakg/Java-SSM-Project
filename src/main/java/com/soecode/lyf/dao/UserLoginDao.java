package com.soecode.lyf.dao;

import com.soecode.lyf.entity.UserInfo;

public interface UserLoginDao {
    UserInfo queryUserInfoLogin(String username);
}
