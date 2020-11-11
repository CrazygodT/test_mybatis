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
import java.util.List;

@WebServlet("/findAll")
public class TeacherFindAllController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TeacherService teacherService = new TeacherServiceIml();
        List<Teacher> teacherList = teacherService.findAll();
        req.setAttribute("teacherList", teacherList);
        req.getRequestDispatcher("teacher.jsp").forward(req,resp);
    }
}
