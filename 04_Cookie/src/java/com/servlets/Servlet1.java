package com.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet1 extends HttpServlet{
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        
        out.println("<h1>Hello "+ name +", welcome to my website...</h1>");
        out.println("<h2> <a href = 'servlet2'>Go to Servlet 2</a></h2>");
       
        //create coockie
        Cookie c = new Cookie("user_name",name);
        resp.addCookie(c);
    }
    
}
