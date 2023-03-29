
package com.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyHttpServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException{
        
        
        System.out.println("This is get method of http servlet...");
        
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        
        out.print("<h1>Hello this is get method of HTTP Servlet..</h1>");
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
