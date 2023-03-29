package com.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterServlet extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException ,IOException{
        
        System.out.println("This is register servlet...");
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome to Register Servlet</h2>");
        
        String name = req.getParameter("user_name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String cond = req.getParameter("condition");
        
        if(cond != null){
            
            if(cond.equals("checked")){
                out.println("<h2>Name: " + name + "</h2>");
                out.println("<h2>Password: " + password + "</h2>");
                out.println("<h2>Email: " + email + "</h2>");
                out.println("<h2>Genter: " + gender + "</h2>");
                out.println("<h2>Your favourite subject: " + course + "</h2>");
            }
        }else{
            out.println("<h2> You haven't accepted terms and conditions, try again!</h2>");
        }
    }
}
