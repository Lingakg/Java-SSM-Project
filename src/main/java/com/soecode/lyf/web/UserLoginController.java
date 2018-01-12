package com.soecode.lyf.web;

import com.soecode.lyf.base.BaseModel;
import com.soecode.lyf.service.UserLoginService;
import com.soecode.lyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value="login",method= RequestMethod.GET)
    @ResponseBody
    private BaseModel login(HttpServletRequest request,String username, String password){
        int state = userLoginService.queryUserInfo(request,username,password);
        if(state==1){
            return new BaseModel("ok");
        }else if(state==2){
            return new BaseModel("fail","密码错误");
        }else if(state==0){
            return new BaseModel ("fail","用户未注册");
        }else{
            return new BaseModel("网络错误");
        }
    }
}
