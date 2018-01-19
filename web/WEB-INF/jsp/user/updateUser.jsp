<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>账号修改</title>
</head>
<body>
<div style="text-align: center">
    <form action="updateUser.action" method="post">
        <label for="id" hidden>id：</label><input hidden id="id" name="id" value="${tbUser.id}">
        <label for="department">所属部门：</label>
        <select name="department" id="department">
            <option value="信息技术部" selected>信息技术部</option>
            <option value="研发部">研发部</option>
            <option value="环境事业部">环境事业部</option>
        </select><br>
        <label for="account">账号：</label><input id="account" name="account" value="${tbUser.account}"><br>
        <label hidden for="password">密码：</label><input hidden id="password" name="password" value="${tbUser.password}"><br>
        <label for="accountType">账号类型：</label>
        <input type="checkbox" name="accountType" id="accountType" value="管理员">
        管理员&nbsp;&nbsp;&nbsp;<input type="checkbox" name="accountType" value="部署员">
        部署员&nbsp;&nbsp;&nbsp;<input type="checkbox" name="accountType" value="演示员" checked>演示员<br>
        <label for="accountStatus">账号状态：</label>
        <select name="accountStatus" id="accountStatus">
            <option value="可用">可用</option>
            <option value="禁用">禁用</option>
        </select><br>
        <input type="submit" value="保存">&nbsp;&nbsp;&nbsp;<button>取消</button>
    </form>
</div>
</body>
</html>
