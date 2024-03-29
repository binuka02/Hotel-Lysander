<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <title>Login</title>

  <style>

    #background
    {
      margin-top: 200px;
      margin-bottom: 200px;


    }
    #column1
    {
      border: 2px;
      border-radius: 20px;
      opacity: 0.95;
      margin-left: 450px;
      margin-right: 450px;

    }

    form
    {
      margin-left: 30px;
      margin-right: 30px;
    }
    #heading
    {
      font-size: 45px;
      color: #9e6c1c;
      text-align: center;
      font-weight: bold;
    }
    #container_background
    {
      background-image : url("Images/loginsignup.jpg");
      background-size: cover;
    }

    #floatingInput
    {
      border-radius: 12px;
    }
    #signup
    {
      font-weight: bold;
      font-style: italic;
      font-size: 13px;
      text-align: center;
      margin-bottom: 0px;
    }
    #buttons
    {
      border-radius: 12px;
      background-color: #9e6c1c;
    }
    .btn{
      margin-top: 10px;
      border-radius: 20px;
    }

  </style>
  <script>
    $(function(){
      $("#header").load("header.html");
      $("#footer").load("footer.html");
    });
  </script>


</head>

<body>

<div class="d-flex-container px-4" id="container_background">
  <div class="row gx-5">
    <div class="col" id="background">
      <div class="p-3 border bg-light" id="column1">

        <p id="heading">LOG-IN</p><br>

        <form action="./loginController" method="POST">

          <div class="form-floating mb-3">
            <input type="text" class="form-control" id="floatingInput" name="guest_Fname" placeholder="UserName or Firstname" required>
            <label for="floatingInput">Username</label>
          </div>
          <div class="form-floating mb-3">
            <input type="password" class="form-control" id="floatingInput" name="guest_NIC" placeholder="NIC" required>
            <label for="floatingInput">Password</label>
          </div>
          <div class="d-grid gap-2 col-6 mx-auto">
            <button type="submit" class="btn btn-secondary" id="buttons">Log In</button>
          </div><br><br>

          <p id="signup">If You Don't Have an Account</p>

          <div class="d-flex justify-content-center" id="h_login_signup_button">
            <a href="SignUpPage.jsp"><button type="submit" class="btn" onclick="myFunctionsignupForm()">SIGN UP</button></a>
          </div>

        </form>

      </div>
    </div>

  </div>
</div>
<jsp:include page="Footer.html"></jsp:include>
<script>
  //function to open the login and signup
  function myFunctionsignupForm() {
    window.open("SignUpPage.jsp","_self");
  }
</script>
<script src="https://cdn.jsdelivr.n et/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>

