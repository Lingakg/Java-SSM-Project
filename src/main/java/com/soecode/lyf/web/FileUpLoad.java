package com.soecode.lyf.web;

import com.soecode.lyf.base.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
public class FileUpLoad {

    @RequestMapping(value="/upload",method = RequestMethod.POST)
    @ResponseBody
    public BaseModel file(MultipartFile multipartFile, HttpSession session) throws Exception{

        BaseModel baseModel = null;
        if(multipartFile.getOriginalFilename()!=null){
            baseModel  = new BaseModel(multipartFile.getOriginalFilename());
        }

        return baseModel;
    }
}
