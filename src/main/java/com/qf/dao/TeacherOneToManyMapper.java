package com.qf.dao;

import com.qf.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherOneToManyMapper {

    Teacher findByTeacherId(Integer tid);

    Teacher findById(@Param("tid")Integer tid);

    int update(Teacher teacher);

    int delete(Integer tid);

    int insertTeacher(Teacher teacher);

    List<Teacher> selectByField(Teacher teacher);
}
