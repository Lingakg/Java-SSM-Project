package com.soecode.lyf.web;

import com.soecode.lyf.base.BaseModel;
import com.soecode.lyf.entity.Segin;
import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.PersonUserService;
import com.soecode.lyf.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PersonUserService personUserService;

    @RequestMapping(value="/{userId}",method = RequestMethod.GET)
    @ResponseBody
    private BaseModel info(@PathVariable("userId") long userId){
        User userinfo = userService.getUserById(userId);
        BaseModel user;
        if(userinfo!=null){
             user = new BaseModel(userinfo);
        }else{
            user = new BaseModel("获取失败，用户id不存在",userinfo);
        }
        return user;
    }

    @RequestMapping(value="/segin",method = RequestMethod.POST)
    @ResponseBody
    private BaseModel segin(String username,String password){
        return personUserService.addUser(username,password);
    }

    @RequestMapping(value="/serach",method = RequestMethod.POST)
    @ResponseBody
    private BaseModel serach(String username,String password){
        Map map = new HashMap();
        map.put("username",username);
        map.put("password",password);
        return new BaseModel(map);
    }

    @RequestMapping(value="/queryId/{username}")
    @ResponseBody
    private BaseModel queryId(@PathVariable("username") String username){
        int userID = 0;
        BaseModel queryUserId;
        User curUser = userService.queryUserNameByUserName(username);
        if(curUser!=null){
            userID = userService.queryUserIdByUserName(username);
            queryUserId = new BaseModel(userID);
        }else{
            queryUserId = new BaseModel("查询的用户名不存在",null);
        }
        return queryUserId;
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    private BaseModel login(HttpServletRequest request,String username,String password){
        Cookie[] cookie = request.getCookies();
        if(cookie!=null){
            for(Cookie cke:cookie){
                System.out.println(cke.getName()+":"+cke.getValue());
            }
        }
        User loginUser = userService.queryUserNameByUserName(username);
        BaseModel loginBase = null;
        if(loginUser!=null){
            if(loginUser.getPassword().equals(password)){
                loginBase =  new BaseModel("登录成功",loginUser.getUserName());
            }else{
                loginBase =  new BaseModel("密码错误",loginUser.getUserName());
            }
        }else{
            loginBase = new BaseModel("用户未注册",loginUser);
        }

        return loginBase;
    }
}
