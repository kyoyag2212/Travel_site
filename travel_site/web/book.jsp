<%-- 
    Document   : book
    Created on : Jul 24, 2019, 4:36:04 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Booking Page</title>
   <style type="text/css">
  w3-myfont {  font-family: "Algerian", cursive, sans-serif;}
body {
background-image: url("Images/background.jpg");
 background-size:cover;
}
</style>
                       
    </head>
<body>
    <div class="w3-card-4">
  <div class="w3-container w3-indigo">
    <h2>Book</h2>
  </div>
  <form class="w3-container" action=confirm.jsp>
    <p>      
    <label class="w3-text-white"><b>From:</b></label>
    <input class="w3-input w3-border w3-white" name="first" type="text" required></p>
    <p>      
    <label class="w3-text-white"><b>Destination</b></label>
    <select class="w3-select" name="option" required >
    <option value="" disabled selected>Choose your option</option>
    <option value="1">Mountain</option>
    <option value="2">Nature</option>
    <option value="3">Snow</option>
    </select>
        <label class="w3-text-white"><b>Days of Visit:</b></label>
    <input class="w3-input w3-border w3-white" name="days" type="number" required></p>
    <label class="w3-text-white"><b>Mode of Travel:</b></label>
    <p>
        <input class="w3-radio" type="radio" name="travel" value="air" checked>
         <label class="w3-text-black">Flight</label></p>
       <p>
         <input class="w3-radio" type="radio" name="travel" value="water" checked>
         <label class="w3-text-black">Cruise</label></p>
       <p>
         <input class="w3-radio" type="radio" name="travel" value="land" checked>
         <label class="w3-text-black">Car</label></p>
    <p>
    <button class="w3-btn w3-indigo">Book</button></p>
  </form>
</div>
</body>
</html>
