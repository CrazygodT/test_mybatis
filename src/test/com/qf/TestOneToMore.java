package com.qf;

import com.qf.dao.TeacherManyToManyMapper;
import com.qf.dao.TeacherOneToManyMapper;
import com.qf.dao.TeacherOneToOneMapper;
import com.qf.pojo.Teacher;
import com.qf.pojo.TeacherOneToOne;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestOneToMore {

    @Test
    public void testOneToMoreFindById() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        Teacher teacher = mapper.findById(2);
        System.out.println(teacher);
    }

    @Test
    public void testOneToMoreByTeacherId() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);
        Teacher teacher = mapper.findByTeacherId(1);
        System.out.println(teacher);
    }

    @Test
    public void testOneToOne() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 打开连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherOneToOneMapper mapper = sqlSession.getMapper(TeacherOneToOneMapper.class);
        List<TeacherOneToOne> teacher = mapper.selectAll();
        for (TeacherOneToOne t : teacher) {
            System.out.println(t);
        }
    }

    @Test
    public void testManyToMany() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherManyToManyMapper mapper = sqlSession.getMapper(TeacherManyToManyMapper.class);
        List<Teacher> teachers = mapper.findAll();
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }

    @Test
    public void testManyToManyById() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherManyToManyMapper mapper = sqlSession.getMapper(TeacherManyToManyMapper.class);
        List<Teacher> teachers = mapper.findById(1);
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }

    @Test
    public void testTeacherByField() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开连接
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherOneToManyMapper mapper = sqlSession.getMapper(TeacherOneToManyMapper.class);

        // 创建对象
        Teacher teacher = new Teacher();
        teacher.setAddress("南");
        List<Teacher> teachers = mapper.selectByField(teacher);
        System.out.println(teachers);
    }
}
