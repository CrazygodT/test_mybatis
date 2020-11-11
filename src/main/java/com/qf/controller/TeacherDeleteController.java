package com.qf.controller;

import com.qf.service.TeacherService;
import com.qf.service.serviceImpl.TeacherServiceIml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class TeacherDeleteController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("tid");
        Integer tid = Integer.valueOf(id);
        TeacherService teacherService = new TeacherServiceIml();

        int i = teacherService.delete(tid);
        if (i > 0) {
            resp.sendRedirect("/findAll");
        }
    }
}
