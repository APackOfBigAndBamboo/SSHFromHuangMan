<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录页面</title>
</head>
<body style="text-align: center">
<form action="logon.action" method="post">
    <p><span>Account: </span><input name="account" maxLength="15" required><br></p>
    <p><span>Password: </span><input type="password" name="password" maxLength="15" required><br></p>
    <input type="submit" value="Submit">
</form>
</body>
</html>
