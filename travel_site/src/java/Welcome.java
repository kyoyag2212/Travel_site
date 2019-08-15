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

/**
 *
 * @author Admin
 */
public class Welcome extends HttpServlet {

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
             String res1= request.getParameter("uname");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
            out.println("<title>Welcome</title>");
            out.println("<style type='text/css'>\n" +
                     ".w3-myfont {  font-family: \"Algerian\", cursive, sans-serif;}\n"+
           "body {\n"+
            "background-image: url(\"Images/welcome.jpg\");\n"+
            " background-size:cover;\n" +
             "}\n"+
             
            "</style>"); 
            

             
 
 

            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"w3-top w3-margin-bottom\">");
            out.println("<div class=\"w3-row w3-padding w3-white\">");
            out.println("<div class=\"w3-col s3\">");
            out.println("<a href=\"HomeServlet\" class=\"w3-button w3-block w3-text-white w3-black\">Kyoya Travels</a>");
            out.println(" </div>");
            out.println("<div class=\"w3-col s3 \">");
            out.println("<a href=\"Explore\" class=\" w3-button w3-block w3-text-white w3-black\">Explore</a>");
            out.println("</div>");
             out.println("<div class=\"w3-col s3 \">");
            out.println("<a href=\"book.jsp\" class=\" w3-button w3-block w3-text-white w3-black\">Book</a>");
            out.println("</div>");

            out.println("<div class=\"w3-col s3 \">");
            out.println("<a href=\"LogoutServlet\" class=\" w3-button w3-block w3-text-white w3-black\">Logout</a>");
            out.println("</div>");
            

            out.println("</div>");
            out.println("</div>");
            out.println("<h1 align=center class=\"w3-display-middle w3-xxxlarge w3-myfont w3-text-white\"> Welcome " +res1 + "\n");
            
            out.println("</body>");
            out.println("</html>");
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
