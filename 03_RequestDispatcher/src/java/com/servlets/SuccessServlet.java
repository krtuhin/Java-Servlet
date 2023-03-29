//this servlet will called by register servlet using forward method and print the data of this servlet inthe browser

package com.servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class SuccessServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        
        out.println("This is Success Servlet");
        out.println("<h2> Successfully Regustered...</h2>");
    }
}
