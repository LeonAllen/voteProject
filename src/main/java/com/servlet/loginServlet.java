package main.java.com.servlet;

import main.java.com.dao.adminDAO;
import main.java.com.entity.admin;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by weicheng on 2017/4/23.
 */
public class loginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        adminDAO a = new adminDAO();

        try {
            if(a.getadmin(username,password)){
                System.out.println("登陆成功");
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            }
            else {
                System.out.println("登陆失败");
                request.getRequestDispatcher("/login.jsp").forward(request, response);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
