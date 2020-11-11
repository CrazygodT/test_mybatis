package com.qf.service;

import com.qf.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

public interface TeacherService {

    Teacher findByTeacherId(Integer tid) throws IOException;

    Teacher findById(@Param("tid")Integer tid);

    int update(Teacher teacher);

    int delete(Integer tid);

    int insertTeacher(Teacher teacher);

    List<Teacher> selectByField(Teacher teacher);

    List<Teacher> findAll();
}
