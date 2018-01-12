package com.soecode.lyf.service;

import com.soecode.lyf.base.BaseModel;
import com.soecode.lyf.entity.PersonUser;

public interface PersonUserService {

    PersonUser queryPeronUser(long personUserId);

    BaseModel addUser(String username, String password);
}
