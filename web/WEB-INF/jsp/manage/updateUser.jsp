<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>修改账号</title>
</head>
<body>
<div style="text-align: center">
    <form action="user-update?id=''" method="post">
        <span hidden>ID</span><input hidden name="${user.id}">
        <span>所属部门：</span><input type="text" name="${user.department}"><br>
        <span>账号：</span><input type="text" name="${user.account}"><br>
        <span>密码：</span><input type="text" name="${user.password}"><br>
        <span>账号类型：</span><input type="text" name="${user.accountType}"><br>
        <span>账号状态：</span><input type="text" name="${user.accountStatus}"><br>
        <input type="submit" value="保存">&nbsp;&nbsp;&nbsp;<button>取消</button>
        <div style="background: yellow;"><s:property value="#request.user.id"/> </div>
    </form>
</div>
</body>
</html>
