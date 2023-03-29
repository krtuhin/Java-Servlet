/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author krtuh
 */
public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            
//            Thread.sleep(800);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + "Welcome" + "</h1>");
            
            //getting data from form field
            String name = req.getParameter("user_name");
            String password = req.getParameter("user_password");
            String email = req.getParameter("user_email");
            
            out.println("<h2>");
            out.println("Name: " + name + "<br>");
            out.println("Password: " +password + "<br>");
            out.println("Email: " +email);
            out.println("</h2>");

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
            
            out.println("</body>");
            out.println("</html>");
            
        }catch (SQLException e){
            System.out.print("Error.....");
        }catch( ClassNotFoundException e){
            System.out.print("Error......2");
        }
//        catch(InterruptedException e){
//            
//        }
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
