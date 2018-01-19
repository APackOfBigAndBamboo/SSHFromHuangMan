<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<div style="text-align: center">
    <form action="addUser.action" method="post">
        <span>所属部门：</span>
        <select name="department">
            <option value="信息技术部" selected>信息技术部</option>
            <option value="研发部">研发部</option>
            <option value="环境事业部">环境事业部</option>
        </select><br>
        <span>账号：</span><input required name="account"><br>
        <span>密码：</span><input required name="password"><br>
        <span>账号类型：</span><input type="checkbox" name="accountType" value="管理员">
        管理员&nbsp;&nbsp;&nbsp;<input type="checkbox" name="accountType" value="部署员">
        部署员&nbsp;&nbsp;&nbsp;<input type="checkbox" name="accountType" value="演示员" checked>演示员<br>
        <span>账号状态：</span>
        <select name="accountStatus">
            <option value="可用" selected>可用</option>
            <option value="禁用">禁用</option>
        </select> <br>
        <input type="submit" value="保存">&nbsp;&nbsp;&nbsp;<button>取消</button>
    </form>
</div>
</body>
</html>
