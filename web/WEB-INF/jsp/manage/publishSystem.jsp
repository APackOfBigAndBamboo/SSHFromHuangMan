<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>发布系统列表</title>
</head>
<body>
<div style="text-align: center">
    <label for="systemName">系统名称：</label><input id="systemName" name="systemName" required>&nbsp;&nbsp;&nbsp;<button>查询</button>
    <table border="1" style="margin: auto; border-collapse: collapse;">
        <thead style="text-align: center">
        <tr>
            <th>序号</th>
            <th>系统名称</th>
            <th>行业</th>
            <th>部署部门</th>
            <th>系统状态</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody style="text-align: center">
        <s:iterator value="#request.list" status="status">
        <tr>
            <td hidden><s:property value="id"/> </td>
            <td><s:property value="#status.count"/></td>
            <td><s:property value="systemName"/> </td>
            <td><s:property value="industry"/> </td>
            <td><s:property value="deploymentServices"/> </td>
            <td><s:property value="systemStatus"/> </td>
            <td><a href="">修改</a> </td>
        </tr>
        </s:iterator>
        </tbody>
    </table>
</div>
</body>
</html>
