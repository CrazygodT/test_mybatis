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

@WebServlet("/findById")
public class TeacherFindByIdController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TeacherService teacherService = new TeacherServiceIml();
        Teacher teacher = teacherService.findById(Integer.valueOf(req.getParameter("tid")));
        req.setAttribute("teacher", teacher);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }
}
