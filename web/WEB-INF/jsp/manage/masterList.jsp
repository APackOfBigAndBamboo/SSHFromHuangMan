<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>部署主机列表</title>
</head>
<body>
<div style="text-align: center">
    <label for="systemName">系统名称：</label><input id="systemName" name="systemName" required>&nbsp;&nbsp;&nbsp;<button>查询</button>
    <table border="1" style="margin: auto; border-collapse: collapse;">
        <thead style="text-align: center">
        <tr>
            <th>序号</th>
            <th>系统名称</th>
            <th>主机ip</th>
            <th>操作系统品牌及版本</th>
            <th>存储空间</th>
            <th>内存</th>
            <th>cpu个数</th>
            <th>cpu核数</th>
            <th>用途</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody style="text-align: center">
        <s:iterator value="#request.list" status="status">
            <s:if test="#status.odd == true">
            <tr style="background: #cccccc;">
                <td hidden><s:property value="id"/></td>
                <td><s:property value="#status.count"/></td>
                <td><a href='deploy-getDeployByName.action?id=<s:property value="id"/>'><s:property value="systemName"/></a></td>
                <td><a href='deploy-getDeployByIp.action?id=<s:property value="id"/>'><s:property value="masterIp"/></a></td>
                <td><s:property value="systemBrand"/></td>
                <td><s:property value="storageSpace"/></td>
                <td><s:property value="memory"/></td>
                <td><s:property value="cpuNum"/></td>
                <td><s:property value="cpuCores"/></td>
                <td><s:property value="onPremise"/></td>
                <td><a href="masterAdd.action">新增主机</a>&nbsp;&nbsp;&nbsp;<a href='masterUpdate.action?id=<s:property value="id"/>'>修改</a>&nbsp;&nbsp;&nbsp;<a href='deleteMaster.action?id=<s:property value="id"/>'>删除</a></td>
            </tr>
            </s:if>
            <s:else>
            <tr>
                <td hidden><s:property value="id"/></td>
                <td><s:property value="#status.count"/></td>
                <td><a href='deploy-getDeployByName.action?id=<s:property value="id"/>'><s:property value="systemName"/></a></td>
                <td><a href='deploy-getDeployByIp.action?id=<s:property value="id"/>'><s:property value="masterIp"/></a></td>
                <td><s:property value="systemBrand"/></td>
                <td><s:property value="storageSpace"/></td>
                <td><s:property value="memory"/></td>
                <td><s:property value="cpuNum"/></td>
                <td><s:property value="cpuCores"/></td>
                <td><s:property value="onPremise"/></td>
                <td><a href="masterAdd.action">新增主机</a>&nbsp;&nbsp;&nbsp;<a href='masterUpdate.action?id=<s:property value="id"/>'>修改</a>&nbsp;&nbsp;&nbsp;<a href='deleteMaster.action?id=<s:property value="id"/>'>删除</a></td>
            </tr>
            </s:else>
        </s:iterator>
        </tbody>
    </table>
</div>
</body>
</html>
