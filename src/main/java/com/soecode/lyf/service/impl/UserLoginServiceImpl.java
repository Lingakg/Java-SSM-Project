package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.UserLoginDao;
import com.soecode.lyf.entity.UserInfo;
import com.soecode.lyf.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.text.SimpleDateFormat;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;

    @Override
    public int queryUserInfo(HttpServletRequest request,String username, String password) {
        UserInfo ui= userLoginDao.queryUserInfoLogin(username);
        if(ui!=null){
            if(ui.getPassword().equals(password)){
                Date day=new Date();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String un = ui.getUsername();
                String up = ui.getPassword();
                Jedis jedis = new Jedis("127.0.0.1", 6379);
                jedis.set(un,df.format(day));
                HttpSession session = request.getSession();
                session.setAttribute("username",username);
                return 1;
            }else{
                return 2;
            }
        }else{
            return 0;
        }
    }
}
