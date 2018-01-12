package com.soecode.lyf.dao;

import com.soecode.lyf.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    User queryUserById(long id);

    List<User> queryUserList();

    int queryUserIdByUserName(@Param("username") String username);

    User queryUserNameByUserName(@Param("username") String username);

}
