package com.servlets;
import javax.servlet.*;
import java.io.*;
public class SecondServlet extends GenericServlet{
    
    public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException{
        System.out.println("This servlet using Grneric Servlet class...");
        
        resp.setContentType("text/html");
        PrintWriter pr = resp.getWriter();
        
        pr.println("<h1>Hello this is using generic class...</h1>");
        pr.println("<h1>Hello this is using generic class...</h1>");

    }
    
}
