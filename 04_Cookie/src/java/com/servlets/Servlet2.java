package com.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet2 extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        
        //it cannot store username
        String name = req.getParameter("name");
        
        //getting all the cookies 
        Cookie cookies[] = req.getCookies();
        
        boolean f = false;
        String name1 = "";
        
        
        if(cookies==null){
            out.println("<h1> You are new user, go to home screen and enter your name</h1>");
            return;
        }else{
            for(Cookie c:cookies){
                String tname = c.getName();
                if(tname.equals("user_name")){
                    f = true;
                    
                    //get cookie value
                    name1 = c.getValue();
                }
            }
        }
        if(f){
            out.println("<h1>Hello "+name1+", welcome back to my website..</h1>");
        }else{
            out.println("<h1> Your are new user..!!</h1>");
        }
    }
}
