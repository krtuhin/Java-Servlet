package com.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
public class FirstServlet implements Servlet{
    
    ServletConfig conf;
    
    //life cycle method
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating object....");
    }
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("Servicing.....");
        
        //set content type of the response
        resp.setContentType("text/html");
       PrintWriter p = resp.getWriter();
       
       p.println("<h1> This is the servlet output</h1>");
       p.println("<h1>Todays date and time: "+ new Date().toString()+"</h1>");

    }
    
    public void destroy(){
        System.out.println("Going to destroy the onject....");
    }
    
    //non life cycle method
    public ServletConfig getServletConfig(){
     
        return conf;
    }
    public String getServletInfo(){
        
        return "This is created by Tuhin";
    }
}
