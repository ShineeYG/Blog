<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/23
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .col-center-block {
            float: none;
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
</head>
<body>
<div class="container col-md-3 col-center-block">
    <div class="container table table-bordered">
        <h4>登录</h4><hr>
        <form  action="/regiest" method="post">
            <label for="InputUsername">用户名</label>
            <input type="text" class="form-control"
                   id="InputUsername" placeholder="请输入用户名" name="name">
            <br>
            <label for="InputPassword">密码</label>
            <input type="password" class="form-control"
                   id="InputPassword" placeholder="请输入密码" name="password">
            <br>
            <label for="reInputPassword">重复密码</label>
            <input type="text" class="form-control"
                   id="reInputPassword" placeholder="再次输入密码" name="secPassword">
            <br>
            <label for="InputTel">电话</label>
            <input type="text" class="form-control"
                   id="InputTel" placeholder="请输入手机号" name="tel">
            <br>
            <label for="InputAdd">地址</label>
            <input type="text" class="form-control"
                   id="InputAdd" placeholder="请输入地址" name="address">
            <br>


            <button type="submit" class="btn btn-default">提交注册</button>
            <%--<a class="btn btn-default" href="#" role="button">注册</a>--%>
        </form>
    </div>
</div>
</body>
</html>