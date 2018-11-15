package com.kawu.studio.dao;

import com.kawu.studio.BaseTest;
import com.kawu.studio.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDaoTest extends BaseTest{

    @Autowired
    private StudentDao studentDao;

    @Test
    public void testQueryById() throws Exception {
        long stnum = 3057;
        Student student = studentDao.queryById(stnum);
        System.out.println(student);
    }
}
