/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
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
public class ProfileServlet extends HttpServlet {

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
            String first_name=request.getParameter("uname");
            String last_name=request.getParameter("fname");
            String gender=request.getParameter("gender");
            String option =request.getParameter("option");
            String destination="";
            out.println(first_name);
            out.println(last_name);
            out.println(gender);
            if(option.equals("1"))
            { destination="Mountain";
            out.println(destination);
                    }
            else if(option.equals("2"))
            { destination="Nature";
            out.println(destination);
                    }
            else
            {destination="Snow";
            out.println(destination);
            }
           try
           {
              Class.forName("org.sqlite.JDBC");
              Connection con=DriverManager.getConnection("jdbc:sqlite:E:\\sqlite-tools-win32-x86-3290000\\test.db");
               
               PreparedStatement pstmt = con.prepareStatement("insert into Data values(?,?,?,?)");
               

               
            pstmt.setString(1, first_name);  
            pstmt.setString(2, last_name);
            pstmt.setString(3, gender);
            pstmt.setString(4, destination);
            int exe=pstmt.executeUpdate();
            request.getRequestDispatcher("Login").forward(request, response);
            con.close();
           }
           catch(Exception e)
           {
               out.println(e);
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
