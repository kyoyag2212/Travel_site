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
public class Explore extends HttpServlet {

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
            out.println("<title>Explore</title>");
            out.println("<style type='text/css'>\n" +
                     ".w3-myfont {  font-family: \"Comic Sans MS\", cursive, sans-serif;}\n"+
                    "body {\n"+
            "background-image: url(\"Images/night.jpg\");\n"+
            " background-size:cover;\n" +
                    
             "}\n"+
                    
                    
            "</style>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"w3-top w3-margin-bottom\">");
            out.println("<div class=\"w3-row w3-padding w3-white\">");
            out.println("<div class=\"w3-col s3\">");
            out.println("<a href=\"HomeServlet\" class=\"w3-button w3-block w3-text-deep-orange w3-white\">Kyoya Travels</a>");
            out.println(" </div>");
            out.println("<div class=\"w3-col s3\">");
            out.println("<a href=\"book.jsp\" class=\"w3-button w3-block w3-text-amber w3-white\">Book</a>");
            out.println("</div>");
            out.println("<div class=\"w3-col s3\">");
           out.println("<a href=\"LogoutServlet\" class=\"w3-button w3-block w3-text-teal w3-white\">Logout</a>");
           
            out.println("</div>");
            out.println("<div class=\"w3-col s3\">");
            out.println("<h1 align=center class=\"w3-display-bottom middle w3-xxxlarge w3-myfont w3-text-black\"> Welcome \n");

            out.println("</div>");
            out.println("</div>");
            
           
            out.println("<div class=\"w3-row\">");
            
            out.println("<div class=\"w3-row-padding w3-margin-top w3-col s4   \">");
            out.println("  <div class=\"w3-third\">");
            out.println("<div class=\"w3-card\">");
            out.println("<img src=\"Images/mountains.jpg\" style=\"width:400px\">");
            out.println(" <div class=\"w3-container \">");
            out.println("<h5  class=\"w3-myfont w3-text-white\"> Mountains</h5>");
            out.println("<p class=\"w3-myfont w3-text-white\">Climb the mountain not to plant your flag, but to embrace the challenge, enjoy the air and behold the view. Climb it so you can see the world, not so the world can see you </p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"w3-row-padding w3-margin-top w3-col s4   \">");
            out.println("  <div class=\"w3-third\">");
            out.println("<div class=\"w3-card\">");
            out.println("<img src=\"Images/nature.jpg\" style=\"width:400px\">");
            out.println(" <div class=\"w3-container\">");
            out.println("<h5  class=\"w3-myfont w3-text-white\">Nature</h5>");
            out.println("<p class=\"w3-myfont w3-text-white\">I have seen many storms in my life. Most storms have caught me by surprise, so I had to learn very quickly to look further and understand that I am not capable of controlling the weather\n</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"w3-row-padding w3-margin-top  w3-col s4   \">");
            out.println("  <div class=\"w3-third\">");
            out.println("<div class=\"w3-card\">");
            out.println("<img src=\"Images/snow.jpg\" style=\"width:400px\">");

            out.println(" <div class=\"w3-container \">");
            out.println("<h5  class=\"w3-myfont w3-text-white\">Snow</h5>");
            out.println("<p class=\"w3-myfont w3-text-white\">Snow was falling,\n" +
                        "so much like stars\n" +
                        "filling the dark trees\n" +
                        "that one could easily imagine\n" +
                        "its reason for being was nothing more\n" +
                        "than prettiness </p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
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
