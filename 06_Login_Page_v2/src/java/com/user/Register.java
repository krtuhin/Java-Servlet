package com.user;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            
            Thread.sleep(800);
            
            //getting data from form field
            String name = req.getParameter("user_name");
            String password = req.getParameter("user_password");
            String email = req.getParameter("user_email");
            
            //(JDBC)
            //loading driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            //creating connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1524:orcl2","scott","system");

            //query
            String q = "insert into users values(u_id.nextval,?,?,?)";
            
            //statement
            PreparedStatement stmp = con.prepareStatement(q);

            //getting data from field 
            stmp.setString(1, name);
            stmp.setString(2, password);
            stmp.setString(3, email);

            //executing query
            stmp.executeUpdate();
            out.println("done");
            
            //close connection
            con.close();
            
        }catch (SQLException e){
            System.out.print("Error.....");
        }catch( ClassNotFoundException e){
            System.out.print("Error......2");
        }catch(InterruptedException e){}
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
