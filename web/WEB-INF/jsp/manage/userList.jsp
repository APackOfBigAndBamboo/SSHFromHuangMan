<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<div style="text-align: center"><a href="passwordUpdate.action">修改密码</a></div>
<div style="text-align: center">
    <label for="account">账号：</label><input id="account" name="account">&nbsp;&nbsp;&nbsp;<a href="getUserByAccount.action?id=" onclick="get()">查询</a>
    <table border="1" style="border-collapse: collapse; margin: auto;">
        <thead style="text-align: center">
        <tr>
            <th>序号</th>
            <th>账号</th>
            <th>所属部门</th>
            <th>账号类型</th>
            <th>账号状态</th>
            <th>操作&nbsp;&nbsp;&nbsp;<a href="userAdd.action">新增</a> </th>
        </tr>
        </thead>
        <tbody style="text-align: center">
        <s:iterator value="#request.list" status="status">
            <s:if test="#status.odd == true">
            <tr style="background: #cccccc;">
                <td hidden><s:property value="id" /></td>
                <td><s:property value="#status.count"/></td>
                <td><s:property value="account" /></td>
                <td><s:property value="department" /></td>
                <td><s:property value="accountType" /></td>
                <td><s:property value="accountStatus" /></td>
                <td><a href="resetPassword.action?id=<s:property value="id"/>">重置密码</a>&nbsp;&nbsp;&nbsp;<a href="userUpdate.action?id=<s:property value="id" />">修改</a></td>
            </tr>
            </s:if>
            <s:else>
                <tr>
                    <td hidden><s:property value="id" /></td>
                    <td><s:property value="#status.count"/></td>
                    <td><s:property value="account" /></td>
                    <td><s:property value="department" /></td>
                    <td><s:property value="accountType" /></td>
                    <td><s:property value="accountStatus" /></td>
                    <td><a href="resetPassword.action?id=<s:property value="id"/>">重置密码</a>&nbsp;&nbsp;&nbsp;<a href="userUpdate.action?id=<s:property value="id" />">修改</a></td>
                </tr>
            </s:else>
        </s:iterator>
        </tbody>
    </table>
</div>
</body>
</html>
