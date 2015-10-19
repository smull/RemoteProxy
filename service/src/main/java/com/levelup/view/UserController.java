package com.levelup.view;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by java on 17.10.2015.
 */
public class UserController  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String age = request.getParameter("age");
//        System.out.println(userName + "is " + age);
        PrintWriter printWriter = response.getWriter();
        printWriter.write(userName);
        printWriter.write(System.lineSeparator());
        printWriter.write(age);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }
}
