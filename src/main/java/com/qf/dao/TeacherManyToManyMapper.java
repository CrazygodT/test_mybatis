package com.qf.dao;

import com.qf.pojo.Teacher;

import java.util.List;

public interface TeacherManyToManyMapper {

    List<Teacher> findAll();

    List<Teacher> findById(Integer tid);
}
