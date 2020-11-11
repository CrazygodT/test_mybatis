package com.qf.controller;

import com.qf.pojo.Teacher;
import com.qf.service.TeacherService;
import com.qf.service.serviceImpl.TeacherServiceIml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert")
public class TeacherAddController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        TeacherService teacherService = new TeacherServiceIml();
        Teacher teacher = new Teacher();
        String a = req.getParameter("age");
        teacher.setAge(Integer.valueOf(a));
        teacher.setTeacherName(req.getParameter("teacherName"));
        teacher.setAddress(req.getParameter("address"));

        int i = teacherService.insertTeacher(teacher);
        if (i > 0) {
            resp.sendRedirect("/findAll");
        }
    }
}
