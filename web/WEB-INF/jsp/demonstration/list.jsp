<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>访问列表</title>
</head>
<body>
<div style="text-align: center">
    <label for="systemName">系统名称：</label><input id="systemName" name="systemName">&nbsp;&nbsp;&nbsp;<button>查询</button>
    <table border="1" style="margin: auto; border-collapse: collapse;">
        <thead style="text-align: center">
        <tr>
            <th>序号</th>
            <th>系统名称</th>
            <th>行业</th>
            <th>部署部门</th>
        </tr>
        </thead>
        <tbody style="text-align: center">
        <s:iterator value="#request.list" status="status">
            <s:if test="#status.odd == true">
                <tr style="background: #cccccc;">
                    <td hidden><s:property value="id"/></td>
                    <td><s:property value="#status.count"/></td>
                    <td><a href='demoBySystemName.action?id=<s:property value="id"/>'><s:property value="master.systemName"/></a></td>
                    <td><s:property value="industry"/></td>
                    <td><s:property value="deploymentServices"/></td>
                </tr>
            </s:if>
            <s:else>
                <tr>
                    <td hidden><s:property value="id"/> </td>
                    <td><s:property value="#status.count"/> </td>
                    <td><a href='demoBySystemName.action?id=<s:property value="id"/>'><s:property value="master.systemName"/></a> </td>
                    <td><s:property value="industry"/> </td>
                    <td><s:property value="deploymentServices"/> </td>
                </tr>
            </s:else>
        </s:iterator>
        </tbody>
    </table>
</div>
</body>
</html>
