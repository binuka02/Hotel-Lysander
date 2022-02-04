<%--
    Document   : bookInLysander
    Created on : Jan 7, 2022, 1:16:26 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
    Document   : bookInLysander
    Created on : Jan 5, 2022, 3:04:43 AM
    Author     : USER
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
    <title>ViewBookings</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!--  jQuery -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
    <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
    <!-- Bootstrap Date-Picker Plugin -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
</head>
<style>

    body
    {
        background-image: url("Images/image.png");
        background-attachment: fixed;
    }

    #background
    {
        margin-top: 50px;
        margin-bottom: 50px;
    }

    #leftcolumn
    {
        border: 2px;
        border-radius: 20px;
        opacity: 0.95;
        margin-left: 200px;
        margin-right: 200px;
    }
    #rightcolumn
    {
        border: 2px;
        border-radius: 20px;
        opacity: 0.95;
        margin-left: 50px;
        margin-right: 50px;
    }
    #column1
    {

        margin-top: 0px;
        background-color: transparent;
    }
    .heading
    {
        font-size: 25px;
        color: #9e6c1c;
        text-align: center;
    }
    .heading#booking
    {
        font-size: 35px;
        font-weight: bold;
    }
    #container1
    {
        margin-top: 0px;
    }
    #buttons
    {
        border-radius: 12px;
        background-color: #9e6c1c;
        width: 200px;
    }
    #labels
    {
        text-align: center;
        font-weight: bold;
    }
    #labels1
    {
        text-align: center;
    }
    #textbox
    {
        margin-right: 90px;
    }
    #floatingInput1
    {
        border-radius: 20px;
    }
    #divbutton
    {
        text-align: center;
    }
    #backbutton
    {
        text-align: center;
    }
    form
    {
        margin-left: 50px;
        margin-right: 50px;
    }
    form-control
    {
        border-radius: 12px;
    }
    #divbackbuttton
    {
        text-align: center;
    }

</style>
<body>
<%--<%--%>
<%--    String userName = null;--%>
<%--    //allow access only if session exists--%>
<%--    if(session.getAttribute("guest_Fname") == null){--%>
<%--        response.sendRedirect("LogInPage.html");--%>
<%--        System.out.println("log in to Your account before booking");--%>
<%--    }else {--%>
<%--        RequestDispatcher rs = request.getRequestDispatcher("HomePage.jsp");--%>
<%--        rs.include(request, response);--%>
<%--    }--%>
<%--%>--%>
<div class="col" id="background"> <!--LEFT SIDE COLUMN-->
    <div class="p-3 border bg-light" id="leftcolumn">

        <br><br><p class="heading" id="booking">VIEW BOOKINGS</p><br>

        <form action="bookInLysanderController" method="POST">

            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="username" id="floatingInput" placeholder="Region">
                <label for="floatingInput">Username</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="region" id="floatingInput" placeholder="Region">
                <label for="floatingInput">Region</label>
            </div>

            <div class="form-group mb-3">
                <div class="container1">

                    <div class="row align-items-start">
                        <div class="col" >
                            <label for="floatingInput">Check-In</label>
                            <input type="text" class="form-control" name="Check-In" id="floatingInput" placeholder="Check-In">
<%--                            <input class="form-control" value="<%=(request.getParameter("checkInDate") == null) ? "" : request.getAttribute("checkInDate") %>" id="date" name="date" placeholder="Check-In" type="text"/>--%>
                        </div>
                        <div class="col">
                            <label for="floatingInput">Check-Out</label>
                            <input type="text" class="form-control" name="Check-Out" id="floatingInput" placeholder="Check-Out">
<%--                            <input class="form-control" id="date1" value="<%=(request.getParameter("checkOutDate") == null) ? "" : request.getAttribute("checkOutDate") %>" name="dateOut" placeholder="Check-Out" type=""/>--%>
                        </div>

                    </div>
                </div>
            </div>


                <div class="form-floating mb-3">
                    <input type="text" class="form-control" name="roomType" id="floatingInput" placeholder="Region">
                    <label for="floatingInput">Room Type</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" name="adultCount" id="floatingInput" placeholder="Region">
                    <label for="floatingInput">Adult Count</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" name="kidsCount" id="floatingInput" placeholder="Region">
                    <label for="floatingInput">Kids Count</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" name="package" id="floatingInput" placeholder="Region">
                    <label for="floatingInput">Package</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" name="customAddons" id="floatingInput" placeholder="Region">
                    <label for="floatingInput">Custom Add-Ons</label>
                </div><br><br>



            <div class="form-group mb-3">
                <div class="container1">

                    <div class="row align-items-start">
                        <div class="col" id="divbutton">
                            <button type="submit" class="btn btn-secondary" id="buttons">UPDATE</button>
                        </div>
                        <div class="col" id="divbutton">
                            <button type="submit" class="btn btn-secondary" id="buttons">DELETE</button>
                        </div>

                    </div>
                </div>


                        </div>
            <div class="form-floating mb-3" id="divbackbuttton">
                <button type="submit" class="btn btn-secondary" id="backbutton" onclick="window.location.href='http://localhost:8080/HotelLysander/'">Back to Home Page</button>

                        </div>




            <br><br><br>
        </form>
    </div>
</div>


<%--<script>--%>
<%--    $(document).ready(function () {--%>
<%--        var date_input = $('input[name="date"]');--%>
<%--        var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";--%>
<%--        var options = {--%>
<%--            format: 'mm/dd/yyyy',--%>
<%--            container: container,--%>
<%--            todayHighlight: true,--%>
<%--            autoclose: true,--%>
<%--        };--%>
<%--        date_input.datepicker(options);--%>
<%--    })--%>
<%--</script>--%>
</body>
</html>


