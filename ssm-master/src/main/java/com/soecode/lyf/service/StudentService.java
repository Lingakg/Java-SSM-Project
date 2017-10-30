package com.soecode.lyf.service;

import com.soecode.lyf.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 查询一个用户
     *
     * @param studentId
     * @return
     * */

    Student getStudentById(long studentId);

    /**
     *
     * 查询所有学生
     *
     * @return
     * */
    List<Student> getStudentList();

}
