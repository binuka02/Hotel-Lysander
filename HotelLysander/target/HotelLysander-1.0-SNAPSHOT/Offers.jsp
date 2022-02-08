<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Corinthia:wght@700&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Offers</title>
    <style>

        @import url("https://fonts.googleapis.com/css?family=Montserrat&display=swap");

        #WelcomeDiv {
            margin-top: 20px;
            margin-left: 10px;
            margin-right: 10px;
        }

        #LysanderHeaderName {
            font-family: Perpetua Titling MT;
            font-weight: bold;
            font-size: 50px;
            color: #9e6c1c;
        }

        #WelcomeDivMainParagraph {
            margin-left: 240px;
            margin-right: 240px;
            ;
        }

        #CarouselDivRoomsPage {
            margin-left: 20px;
            margin-right: 20px;
        }

        #LysanderRoomsHTag {
            background-color: bisque;
            width: 200px;
            padding-top: 20px;
            padding-bottom: 20px;
            padding-left: 10px;
            padding-right: 10px;
        }

        #HotelDescriptionDiv {
            margin-top: -290px;
            margin-bottom: 40px;
        }

        #Lysanders
        {
            font-family: Forte;
            font-size: 80px;
        }
        #category
        {
            font-size: 40px;
            font-weight: bold;
        }

        * {
            padding: 0;
            margin: 0;
        }

        /*body {*/
        /*    height: 100vh;*/
        /*    display: flex;*/
        /*    flex-direction: column;*/
        /*    justify-content: center;*/
        /*    align-items: center;*/
        /*}*/

        p {
            /*font-family: "calibri";*/
            max-width: 40ch;
            text-align: center;
            transform: scale(0.94);
            animation: scale 3s forwards cubic-bezier(0.5, 1, 0.89, 1);
        }
        @keyframes scale {
            100% {
                transform: scale(1);
            }
        }

        span {
            display: inline-block;
            opacity: 0;
            filter: blur(4px);
        }

        span:nth-child(1) {
            animation: fade-in 0.8s 0.1s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(2) {
            animation: fade-in 0.8s 0.2s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(3) {
            animation: fade-in 0.8s 0.3s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(4) {
            animation: fade-in 0.8s 0.4s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(5) {
            animation: fade-in 0.8s 0.5s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(6) {
            animation: fade-in 0.8s 0.6s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(7) {
            animation: fade-in 0.8s 0.7s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(8) {
            animation: fade-in 0.8s 0.8s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(9) {
            animation: fade-in 0.8s 0.9s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(10) {
            animation: fade-in 0.8s 1s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(11) {
            animation: fade-in 0.8s 1.1s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(12) {
            animation: fade-in 0.8s 1.2s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(13) {
            animation: fade-in 0.8s 1.3s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(14) {
            animation: fade-in 0.8s 1.4s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(15) {
            animation: fade-in 0.8s 1.5s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(16) {
            animation: fade-in 0.8s 1.6s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(17) {
            animation: fade-in 0.8s 1.7s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(18) {
            animation: fade-in 0.8s 1.8s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(19) {
            animation: fade-in 0.8s 1.8s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        span:nth-child(20) {
            animation: fade-in 0.8s 1.8s forwards cubic-bezier(0.11, 0, 0.5, 0);
        }

        @keyframes fade-in {
            100% {
                opacity: 1;
                filter: blur(0);
            }
        }

        .card-title
        {
            text-align: center;
            font-weight: bold;
        }

        #book
        {
            justify-content: center;
            align-items: center;
            color: white;
            background-color: #9e6c1c;
            border: #9e6c1c;
            font-weight: bold;
        }
        card-body
        {
            text-align: center;
        }

        #price
        {
            color: #9e6c1c;
            font-weight: bold;
            text-align: center;
            font-size: 18px;
        }

        .col{
            text-align: center;
        }

        .alignment{
            text-align: left;
        }

    </style>

</head>

<body>

    <div class="flex-container text-center" id="WelcomeDiv">

        <p>
            <span><p id="LysanderHeaderName"></p></span>
            <span><p id="LysanderHeaderName">Welcome </p></span>
            <span><p id="LysanderHeaderName"> to</p></span><br><br>
            <span><span id="Lysanders"><p>LYSANDER'S </p></span></span><br>
            <span><span id="category"> -- </span></span>
            <span><span id="category">Special </span></span>
            <span><span id="category">Offers </span></span>
            <span><span id="category">--</span></span><br>
            <span><h6 style="margin-top: 10px; margin-bottom: 40px;">Seaside </h6></span>
            <span><h6 style="margin-top: 10px; margin-bottom: 40px;"> Breaking </h6></span>
            <span><h6 style="margin-top: 10px; margin-bottom: 40px;"> Offers </h6></span>
            <span><h6 style="margin-top: 10px; margin-bottom: 40px;"> Since </h6></span>
            <span><h6 style="margin-top: 10px; margin-bottom: 40px;"> 1815</h6></span>
        </p>


    </div>

    <div>
        <h5 id="LysanderRoomsHTag">SPECIAL OFFERS</h5>
    </div>
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="Images/offers%20(1).jpg" alt="First slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="Images/offers%20(6).jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="Images/offers%20(10).jpg" alt="Third slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="Images/offers%20(8).jpg" alt="Forth slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="Images/offers%20(12).jpg" alt="Fifth slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div><br><br><br>



    <div class="d-flex justify-content-center" style="margin-top: 40px; margin-bottom: 40px;">
        <div class="row">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="Images/offers%20(2).jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">STAY 7, PAY 5</h5>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Book your stay within 48 hours of arrival and save 20% on your stay!</li>
                        <li class="list-group-item"><b>TERMS & CONDITIONS</b></li>
                        <ul>
                            <li class="alignment">Non refundable</li>
                            <li class="alignment">Non changable</li>
                            <li class="alignment">Full deposit required at time of booking</li>
                        </ul>
                        <li class="list-group-item"></li>
                        <li class="list-group-item"><b>BOOK & STAY PERIOD</b></li>
                        <ul>
                            <li class="alignment">Book period : Now to August 2022</li>
                            <li class="alignment">Stay prriod  : Now to August 2022</li>
                        </ul>
                    </ul>
                    <div class="card-body">
                        <button onclick="myFunctionBookOpen()" type="button" class="btn btn-primary" id="book">BOOK NOW</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="Images/offers%20(13).jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">STAY 10, PAY 7</h5>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Book a 10 night stay and pay only for 7 nights!</li>
                        <li class="list-group-item"><b>TERMS & CONDITIONS</b></li>
                        <ul>
                            <li class="alignment">50% chargeable if cancelled within 7 days of arrival</li>
                            <li class="alignment">Free cancellation if cancelled ahead of 7 days</li>
                        </ul>
                        <li class="list-group-item"></li>
                        <li class="list-group-item"><b>BOOK & STAY PERIOD</b></li>
                        <ul>
                            <li class="alignment">Book period : Until October 2022</li>
                            <li class="alignment">Stay period : Until October 2022</li>
                        </ul>
                    </ul>
                    <div class="card-body">
                        <button onclick="myFunctionBookOpen()" type="button" class="btn btn-primary" id="book">BOOK NOW</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="Images/offers%20(11).jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">STAY 3, PAY 5</h5>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Extend your stay to 3 nights and get 100% off on the last night!</li>
                        <li class="list-group-item"><b>TERMS & CONDITIONS</b></li>
                        <ul>
                            <li class="alignment">Full refund offered if cancelled 7 days ahead or more.</li>
                            <li class="alignment">50% booking fee chargeable if cancelled within 7 days of arrival</li>
                        </ul>
                        <li class="list-group-item"></li>
                        <li class="list-group-item"><b>BOOK & STAY PERIOD</b></li>
                        <ul>
                            <li class="alignment">Book period : Until November 2022</li>
                            <li class="alignment">Stay period : Until November 2022</li>
                        </ul>
                    </ul>
                    <div class="card-body">
                        <button onclick="myFunctionBookOpen()" type="button" class="btn btn-primary" id="book">BOOK NOW</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="Images/offers%20(5).jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">EARLY BIRD OFFER</h5>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Book your stay 22 days prior & save up to 20% on your stay.</li>
                        <li class="list-group-item"><b>TREMS & CONDITIONS</b></li>
                        <ul>
                            <li class="alignment">Non refundable</li>
                            <li class="alignment">Non changeable</li>
                            <li class="alignment">Full deposit required at time of booking</li>
                        </ul>
                        <li class="list-group-item"></li>
                        <li class="list-group-item"><b>BOOK & STAY PERIOD</b></li>
                        <ul>
                            <li class="alignment">Book period : Until December 2022</li>
                            <li class="alignment">Stay period : Until December 2022</li>
                        </ul>
                    </ul>
                    <div class="card-body">
                        <button onclick="myFunctionBookOpen()" type="button" class="btn btn-primary" id="book">BOOK NOW</button>
                    </div>
                </div>
            </div>
        </div>
    </div><br><br><br>

    <jsp:include page="Footer.html"></jsp:include>


    <script>
        //function to open the choose country window
        function myFunctionBookOpen() {
            window.open("bookInLysander.jsp", "_self");
        }

        //function to connect to booking page
        function goToBooking() {
            var logInfo = true;
            if (logInfo === true) {
                window.open("BookingNew.html");
            } else {
                window.open("Error.html");
                //window.open("LogInPage.html");
            }
        }

    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>

</html>