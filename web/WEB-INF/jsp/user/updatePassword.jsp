<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>密码修改</title>
</head>
<body>
<div style="text-align: center">
    <form action="updatePassword.action" method="post">
        <label for="old">旧密码：</label><input id="old" name="password"><br>
        <label for="new">新密码：</label><input id="new" name="newPassword"><br>
        <input type="submit" value="保存">&nbsp;&nbsp;&nbsp;<input type="button" value="取消" onclick="history.back();">
    </form>
</div>
</body>
</html>
