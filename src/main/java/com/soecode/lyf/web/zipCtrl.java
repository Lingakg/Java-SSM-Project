package com.soecode.lyf.web;

import com.soecode.lyf.service.ZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.soecode.lyf.entity.Zip;

import java.util.List;

@Controller
public class zipCtrl {

    @Autowired
    private ZipcodeService zipcodeService;

    @RequestMapping(value="/zipcode")
    @ResponseBody
    public List<Zip> zip(){
        return zipcodeService.queryAll();
    }
}
