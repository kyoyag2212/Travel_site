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
public class NewUser extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
            out.println("<title>Register-Kyoya Travels</title>");
            out.println("<style type='text/css'>\n" +
                     ".w3-myfont {  font-family: \"Algerian\", cursive, sans-serif;}\n"+
                    "body {\n"+
            "background-image: url(\"Images/newuser.jpg\");\n"+
            " background-size:cover;\n" +
             "}\n"+
            "</style>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"w3-container \">");
            out.println("<h1 align=center class=\"w3-myfont\">Kyoya Travels</h1>");
            out.println("<div class=\"w3-card-4\">");
            out.println(" <div class=\"w3-container w3-text-white\">");
            out.println(" <h2 align=center class=\"w3-myfont\">Register</h2>");
            out.println("</div>");
            out.println("<form class=\"w3-container\" action=\"ProfileServlet\">");
            out.println("<label  class=\"w3-myfont\">First Name</label></p>");
            out.println(" <input class=\"w3-input w3-border  w3-animate-input\" type=\"text\" name=\"uname\" required style=\"width:30%\"><br>");
            out.println("<label  class=\"w3-myfont\">Last Name</label></p>");
            out.println("<input class=\"w3-input w3-border w3-animate-input\" type=\"text\" name=\"fname\" required style=\"width:30%\"><br>");
            out.println("<label  class=\"w3-myfont\">Gender:</label></p>");
            out.println("<p>");
            out.println("<input class=\"w3-radio\" type=\"radio\" name=\"gender\" value=\"male\" checked>");
            out.println("<label>Male</label></p>");
            out.println("<p>");
            out.println("<input class=\"w3-radio\" type=\"radio\" name=\"gender\" value=\"Female\">");
            out.println("<label>Female</label></p>");
            out.println("<label>Travel Destination:</label></p>");
            out.println("<select class=\"w3-select\" name=\"option\" required >");
            out.println("<option value=\"\" disabled selected>Choose your option</option>");
            out.println("<option value=\"1\">Mountain</option>");
            out.println("<option value=\"2\">Nature</option>");
            out.println("<option value=\"3\">Snow</option>");
            out.println("</select>");
            
             out.println("<br>");
            out.println("<br>");
            out.println("<br>");

            out.println("<input type=\"submit\" class=\"w3-btn w3-padding w3-black\" style=\"width:120px\"><br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");

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
