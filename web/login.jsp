<%--
  Created by IntelliJ IDEA.
  User: weicheng
  Date: 2017/4/23
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Square login form Responsive Widget  Website Template | Home:: w3layouts</title>
  <!-- Custom Theme files -->
  <link href="/voteProject/css/style.css" rel="stylesheet" type="text/css" media="all"/>
  <!-- Custom Theme files -->
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content="Square login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
  <!--Google Fonts-->
  <link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
  <!--Google Fonts-->
</head>

<body>
<!--header start here-->
<div class="login-form">
  <div class="top-login">
    <span><img src="/voteProject/images/group.png" alt=""/></span>
  </div>
  <h1>Login</h1>
  <div class="login-top">
    <form name="myform" action="/voteProject/servlet/loginServlet" method="post">
      <div class="login-ic">
        <i ></i>
        <input type="text" name="username" id="username" value="User name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User name';}"/>
        <div class="clear"> </div>
      </div>
      <div class="login-ic">
        <i class="icon"></i>
        <input type="password" name="password" id="password"  value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}"/>
        <div class="clear"> </div>
      </div>

      <div class="log-bwn">
        <input type="submit"  value="Login" >
      </div>
    </form>
  </div>
  <p class="copy">© 2016 Square Login Form. All rights reserved | Design by  XA308</p>
</div>
<!--header start here-->
</body>

</html>
