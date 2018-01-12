package com.soecode.lyf.web;

import com.soecode.lyf.base.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UpFile {

    @RequestMapping(value="/upfile",method= RequestMethod.GET)
    @ResponseBody
    private BaseModel test(HttpServletRequest request, HttpServletRequest response) throws Exception{
        try {
//            String fullName = file.getOriginalFilename();
            return new BaseModel("ok");
        }catch(Exception e) {
            return new BaseModel("err");
        }
    }
}
