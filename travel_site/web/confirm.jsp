<%-- 
    Document   : confirm
    Created on : 26 Jul, 2019, 11:37:39 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Confirm Booking</title>
        <style type='text/css'>
                     .w3-myfont {  font-family: "Algerian", cursive, sans-serif;}
                    body {
            background-image: url(Images/welcome.jpg);
            background-size:cover;
             }
            </style>
              <div class="w3-card-4">
    <div class="w3-container">
      <h2>Payment Details</h2>
    </div>
            <form class="w3-container" action="HomeServlet">
            <label class="w3-text-white"><b>Payment:</b></label>
    <p>
        <input class="w3-radio" type="radio" name="pay" value="cash" checked>
         <label class="w3-text-black">Cash</label></p>
       <p>
         <input class="w3-radio" type="radio" name="pay" value="card" checked>
         <label class="w3-text-black">Card</label></p>
       <p>
         <input class="w3-radio" type="radio" name="pay" value="Online Banking" checked>
         <label class="w3-text-black">Online Banking</label></p>
       <button class="w3-btn w3-indigo">Confirm</button>
            </form>
              </div>
    </head>
    <body>
        <div class="w3-panel w3-indigo">
  <h3>Bill</h3>
  <p>Amount to be paid is $500</p>
</div>
    </body>
</html>
