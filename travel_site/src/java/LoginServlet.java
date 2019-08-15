/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

/**
 *
 * @author Student
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             
        String name=request.getParameter("uname");  
        String password=request.getParameter("pass");
        Boolean st=false;
            try
           {
              Class.forName("org.sqlite.JDBC");
              Connection con=DriverManager.getConnection("jdbc:sqlite:E:\\sqlite-tools-win32-x86-3290000\\test.db");
               
               PreparedStatement pstmt = con.prepareStatement("select * from Data where f_name=? and l_name=?");
               

               
            pstmt.setString(1, name);  
            pstmt.setString(2, password);
            ResultSet rs =pstmt.executeQuery();
             st = rs.next();
            int exe=pstmt.executeUpdate();
            con.close();
           
            
           }
           catch(Exception e)
           {
               out.println("Incorrect Username or Password");
           }
          
        if(st==true){  
         request.getRequestDispatcher("Welcome").forward(request, response);
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
        }  
        else{  
              
            request.getRequestDispatcher("Login").include(request, response);
            
            
        }  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
