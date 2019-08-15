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
 * @author Student
 */
public class Homepage extends HttpServlet {

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
            out.println("<title>Kyoya Travels</title>");
            out.println("<style type='text/css'>\n" +
                     ".w3-myfont {  font-family: \"Algerian\", cursive, sans-serif;}\n"+
                    "<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>\n" + 
            "</style>");
            /*<style type='text/css'>\n" +
"  body{\n" +
"    background-image:url(Images/travel_main.jpg);\n" +
"    background-size:cover;\n" +
"  \n" +
"  }\n" +
                   " .w3-myfont {  font-family: \\\"Comic Sans MS\\\", cursive, sans-serif;}\n"+

"</style>");*/
 
            out.println("</head>");
            out.println("<body>");
             out.println("<div class=\"w3-container  w3-black\">");
            
            out.println("<button class=\"w3-button w3-blck  w3-xlarge\" onclick=\"w3_open()\">☰</button>");
           
            out.println("<h1 class=\"w3-myfont \">Kyoya Travels</h1>");            
            out.println(" </div>");
    
           
            /*
            out.println("<form method=\"post\" action=\"Homepage\">");
            out.println("Name<input type=\"text\"  name=\"uname\" ><br>");
            out.println("Password<input type=\"password\"  name=\"password\"><br>");web\
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
            */
            
            out.println("<div class=\"w3-content w3-display-middle  w3-margin-top\"  style=\"max-width:1000px\">");
            out.println("<img class=\"mySlides\" src=\"Images/nature.jpg\" style=\"width:1000px\">");
            out.println(" <img class=\"mySlides\" src=\"Images/snow.jpg\" style=\"width:1000px\">");
            out.println("<img class=\"mySlides\" src=\"Images/mountains.jpg\" style=\"width:1000px\">");
            out.println("<div class=\"w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle\" style=\"width:100%\">");
            out.println("<div class=\"w3-left w3-hover-text-khaki\" onclick=\"plusDivs(-1)\">&#10094;</div>");
            out.println("<div class=\"w3-right w3-hover-text-khaki\" onclick=\"plusDivs(1)\">&#10095;</div>");
            out.println("<span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(1)\"></span>");
            out.println(" <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(2)\"></span>");
            out.println("<span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(3)\"></span>");
            out.println("</div>");
            out.println("</div>");
            out.println("<script>");
            out.println("var slideIndex = 1;");
            out.println("showDivs(slideIndex);");
            out.println("function plusDivs(n) {");
            out.println("showDivs(slideIndex += n);");
            out.println("}");
            out.println("function currentDiv(n) {");
            out.println("  showDivs(slideIndex = n);");
            out.println("}");
            out.println("function showDivs(n) {");
            out.println("  var i;");
            out.println("var x = document.getElementsByClassName(\"mySlides\");");
            out.println("var dots = document.getElementsByClassName(\"demo\");");
            out.println("if (n > x.length) {slideIndex = 1}");
            out.println("if (n < 1) {slideIndex = x.length}");
            out.println("for (i = 0; i < x.length; i++) {");
            out.println("  x[i].style.display = \"none\";");
            out.println(" }");
            out.println("for (i = 0; i < dots.length; i++) {");
            out.println("dots[i].className = dots[i].className.replace(\" w3-white\", \"\");");
            out.println("  }");
            out.println("x[slideIndex-1].style.display = \"block\";  ");
            out.println("dots[slideIndex-1].className += \" w3-white\";");
            out.println("}");
            out.println("</script>");              
 

 
  
 
  
 

            out.println("</div>");
        out.println("<div class=\"w3-sidebar w3-bar-block \" style=\"display:none\" id=\"mySidebar\">");
        
        out.println("<button onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-large\">Close &times;</button>");
        out.println(" <a href=\"Login\" class=\"w3-bar-item w3-button\">Login</a>");
        out.println("<a href=\"NewUser\" class=\"w3-bar-item w3-button\">New User</a>");

        out.println("</div>");
        out.println("<script>");
        out.println("function w3_open() {");
        out.println("  document.getElementById(\"mySidebar\").style.width = \"10%\";");
        out.println("  document.getElementById(\"mySidebar\").style.display = \"block\";");
        out.println("}");
        
        out.println("function w3_close() {");
        out.println("document.getElementById(\"mySidebar\").style.display = \"none\";");
        out.println("}");
        out.println("</script>");
          out.println("<div class=\"w3-panel w3-bottom middle  \">");
          out.println("<p class=\"w3-xlarge w3-myfont align=center\"><i>\"Travel makes one modest. You see what a tiny place you occupy in the world.\"</i></p>");
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
