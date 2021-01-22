<%--
  Created by IntelliJ IDEA.
  User: 12934
  Date: 2020/11/18
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="base" value="${pageContext.request.contextPath}" scope="request"/>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${base}/static/lib/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="${base}/static/css/login.css" media="all" />
</head>
<body>
<div class="video_mask"></div>
<div class="login">
    <h1>小树Admin-管理登录</h1>
    <form class="layui-form" action="${base}/login">
        <div class="layui-form-item">
            <label>
                <input class="layui-input" name="username" placeholder="用户名" lay-verify="required" type="text" autocomplete="off"/>
            </label>
        </div>
        <div class="layui-form-item">
            <label>
                <input class="layui-input" name="password" placeholder="密码" lay-verify="required" type="password" autocomplete="off">
            </label>
        </div>
        <div class="layui-form-item form_code">
            <label>
                <input class="layui-input" name="code" placeholder="验证码" lay-verify="required" type="text" autocomplete="off">
            </label>
            <div class="code"><img src="${base}/getCaptcha" width="116" height="36" id="randImage" alt="验证码" onclick = "this.src='${base}/getCaptcha?' + Math.floor(Math.random() * 100)"></div>
        </div>
        <div class="layui-form-item">
            <input type="checkbox" name="rememberMe"  title="记住帐号?">
        </div>
        <div class="layui-form-item">
            <button class="layui-btn login_btn">登录</button>
        </div>
    </form>
</div>
<script type="text/javascript" src="${base}/static/lib/layui/layui.js"></script>
<script type="text/javascript" src="${base}/static/js/login.js"></script>
</body>
</html>
