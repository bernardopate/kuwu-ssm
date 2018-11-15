package com.kawu.studio.dao;

import com.kawu.studio.entity.Student;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface StudentDao {

    /**
     * 通过学号查询学生
     *
     * @param stnum
     * @return
     */
    Student queryById(long stnum);

    /**
     * 查询学生
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Student> queryAll(@Param("offset") int offset, @Param("limit") int limit);


    int insertStu(Student stu);

    int deleteStu(Long stnum);

    int updateStu(Student stu);

}
