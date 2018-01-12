package com.soecode.lyf.dao;

import com.soecode.lyf.entity.PersonUser;
import org.apache.ibatis.annotations.Param;

public interface PersonUserDao {

    PersonUser queryPersonUserById(long personUserId);

    void addUser(@Param("username") String username, @Param("password") String password);
}
