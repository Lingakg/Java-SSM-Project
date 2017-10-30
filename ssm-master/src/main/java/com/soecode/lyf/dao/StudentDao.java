package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    /**
     * 通过ID查询单个用户
     *
     * @param id
     * @return
     */
    Student queryStudentById(long id);

    /**
     * 查询所有用户
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Student> queryStudentAll(@Param("offset") int offset,@Param("limit") int limit);


    /**
     * 添加一个用户
     *
     * @param studentName
     * @param studentSex
     * @parma studentAge
     * */
    void insertStudent(@Param("studentName") String studentName,@Param("studentSex") int studentSex,@Param("studentAge") int studentAge);


    /**
     * 修改一个用户
     *
     * @param studentName
     * @param studengSex
     * @param studentAge
     * */
}
