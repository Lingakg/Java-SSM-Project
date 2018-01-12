package com.soecode.lyf.web;

import com.soecode.lyf.base.BaseModel;
import com.soecode.lyf.entity.PersonUser;
import com.soecode.lyf.service.PersonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/personUser")
public class PersonUserController {


    @Autowired
    private PersonUserService personUserService;

    @RequestMapping(value = "{personuserid}",method = RequestMethod.GET)
    @ResponseBody
    private BaseModel personUserInfo(@PathVariable("personuserid") long personUserId){
        BaseModel psersonUserInfoBase;
        PersonUser personuser = personUserService.queryPeronUser(personUserId);
        if(personuser!=null){
            psersonUserInfoBase = new BaseModel(personuser);
        }else{
            psersonUserInfoBase = new BaseModel("用户id不存在，获取失败",personuser);
        }

        return psersonUserInfoBase;
    }
}
