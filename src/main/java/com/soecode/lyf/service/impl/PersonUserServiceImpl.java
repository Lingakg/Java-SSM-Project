package com.soecode.lyf.service.impl;

import com.soecode.lyf.base.BaseModel;
import com.soecode.lyf.dao.PersonUserDao;
import com.soecode.lyf.entity.PersonUser;
import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.PersonUserService;
import com.soecode.lyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonUserServiceImpl implements PersonUserService {

    @Autowired
    private PersonUserDao personUserDao;

    @Autowired
    private UserService userService;


    @Override
    public PersonUser queryPeronUser(long personUserId) {
        return personUserDao.queryPersonUserById(personUserId);
    }

    @Override
    public BaseModel addUser(String username, String password) {
        BaseModel userSegin = null;
        User curUser = userService.queryUserNameByUserName(username);
        if(curUser==null){
            personUserDao.addUser(username,password);
            curUser = userService.queryUserNameByUserName(username);
            if(curUser!=null){
                userSegin = new BaseModel(curUser);
            }else{
                userSegin = new BaseModel("添加失败",curUser);
            }
        }else{
            userSegin = new BaseModel("用户已经存在",curUser);
        }
        return userSegin;
    }
}
