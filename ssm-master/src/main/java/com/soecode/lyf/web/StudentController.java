package com.soecode.lyf.web;

import com.soecode.lyf.entity.Student;
import com.soecode.lyf.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    @ResponseBody
    private List<Student> list(Model model){
        List<Student> list = studentService.getStudentList();
        model.addAttribute("list",list);
        return list;
    }



}
