package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/page")
public class PageComtroller {
    @RequestMapping(value="/{path}/{secound}",method = RequestMethod.GET)
    private String path(@PathVariable("path") String pathUrl,@PathVariable("secound") String secoundUrl){
        return pathUrl+"/"+secoundUrl;
    }
}
