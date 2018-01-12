package com.soecode.lyf.web;

import com.soecode.lyf.base.BaseModel;
import com.soecode.lyf.entity.Student;
import com.soecode.lyf.service.StudentService;
import javafx.beans.binding.ObjectExpression;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    /**
     * 获取所有学生信息
     * */
    @RequestMapping(value="/list", method = RequestMethod.GET)
    @ResponseBody
    private List<Student> list(Model model){
        List<Student> list = studentService.getStudentList();
        model.addAttribute("list",list);
        return list;
    }

    /**
     * 通过id查询学生
     * */
    @RequestMapping(value="/{studentId}",method = RequestMethod.GET)
    @ResponseBody
    private BaseModel queryStudentById(@PathVariable("studentId") long studentid){
        Student studentInfo = studentService.getStudentById(studentid);
        BaseModel student = new BaseModel(studentInfo);
        return student;
    }

    /**
     * 添加学生
     * */

    @RequestMapping(value = "/addStudent",method = RequestMethod.GET)
    @ResponseBody
    private String addStudent(@Param("name") String name,@Param("age") int sex,@Param("age") int age){
        studentService.insertStudent(name,sex,age);
        return "ok";
    }


}
