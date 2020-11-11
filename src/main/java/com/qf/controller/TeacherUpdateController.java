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

@WebServlet("/update")
public class TeacherUpdateController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        Integer tid = Integer.valueOf(req.getParameter("tid"));
        String teacherName = req.getParameter("teacherName");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String address = req.getParameter("address");

        TeacherService teacherService = new TeacherServiceIml();

        Teacher teacher = new Teacher();
        teacher.setAddress(address);
        teacher.setTeacherName(teacherName);
        teacher.setAge(age);
        teacher.setTid(tid);
        int i = teacherService.update(teacher);

        if (i > 0) {
            resp.sendRedirect("/findAll");
        }
    }
}
