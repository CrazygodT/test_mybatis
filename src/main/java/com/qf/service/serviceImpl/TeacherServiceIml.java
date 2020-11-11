package com.qf.service.serviceImpl;

import com.qf.dao.TeacherManyToManyMapper;
import com.qf.dao.TeacherOneToManyMapper;
import com.qf.pojo.Teacher;
import com.qf.service.TeacherService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TeacherServiceIml implements TeacherService  {

    static SqlSessionFactory sqlSessionFactory;

    public TeacherServiceIml() {

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Teacher findByTeacherId(Integer tid) throws IOException {


        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        return mapper.findByTeacherId(tid);
    }

    @Override
    public Teacher findById(Integer tid) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        return mapper.findById(tid);
    }

    @Override
    public int update(Teacher teacher) {

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        return mapper.update(teacher);
    }

    @Override
    public int delete(Integer tid) {

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        return mapper.delete(tid);
    }

    @Override
    public int insertTeacher(Teacher teacher) {

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        return mapper.insertTeacher(teacher);
    }

    @Override
    public List<Teacher> selectByField(Teacher teacher) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        return mapper.selectByField(teacher);
    }

    @Override
    public List<Teacher> findAll() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherManyToManyMapper mapper = sqlSession.getMapper(TeacherManyToManyMapper.class);
        List<Teacher> teachers = mapper.findAll();
        return teachers;
    }
}
