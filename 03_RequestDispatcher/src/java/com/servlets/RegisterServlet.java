package com.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

//user defined servlet extends httpServlet
public class RegisterServlet extends HttpServlet{
    
    //override the post method of httpServlet
    public void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException ,IOException{
        
        //show in the cmd
        System.out.println("This is register servlet...");
        
        //create content type
        resp.setContentType("text/html");
        
        //creating printWriter object which help to print uotput in the browser
        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome to Register Servlet</h2>");
        
        //store user input inthe variable using servlet
        String name = req.getParameter("user_name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String cond = req.getParameter("condition");
        
        if(cond != null){
            //if checkbox is checked then execute this
            if(cond.equals("checked")){
                out.println("<h2>Name: " + name + "</h2>");
                out.println("<h2>Password: " + password + "</h2>");
                out.println("<h2>Email: " + email + "</h2>");
                out.println("<h2>Genter: " + gender + "</h2>");
                out.println("<h2>Your favourite subject: " + course + "</h2>");
                
                //create object of RequestDispatcher
                
                RequestDispatcher rd = req.getRequestDispatcher("Success");
                
                //when this code will get executed the information of this servlet will not be printed in the browser, it just print the forwarded servlet's body
                rd.forward(req, resp);
            }
        }else{
            //when checkbox is null execute this
            out.println("<h2> You haven't accepted terms and conditions, try again!</h2>");
            
            //create object of request dispatcher
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            
            //call include method
            
            rd.include(req, resp);
        }
    }
}
