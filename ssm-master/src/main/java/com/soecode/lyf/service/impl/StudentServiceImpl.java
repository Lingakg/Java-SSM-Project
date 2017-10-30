package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.StudentDao;
import com.soecode.lyf.entity.Student;
import com.soecode.lyf.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    注入service依赖
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudentById(long studentId) {
        return studentDao.queryStudentById(studentId);
    }

    @Override
    public List<Student> getStudentList() {
        return studentDao.queryStudentAll(0,1000);
    }
}
