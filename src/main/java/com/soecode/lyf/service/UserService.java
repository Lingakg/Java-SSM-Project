package com.soecode.lyf.service;

import com.soecode.lyf.entity.User;

public interface UserService {
    User getUserById(long userId);

    int queryUserIdByUserName(String username);

    User queryUserNameByUserName(String username);
}
