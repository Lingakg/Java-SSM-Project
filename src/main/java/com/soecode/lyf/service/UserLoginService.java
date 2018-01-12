package com.soecode.lyf.service;

import com.soecode.lyf.entity.UserInfo;

import javax.servlet.http.HttpServletRequest;

public interface UserLoginService {
    int queryUserInfo(HttpServletRequest request,String username, String password);
}
