<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>新增主机</title>
</head>
<body>
<div style="text-align: center">
    <form action="addMaster.action" method="post">
        <label for="systemName">系统名称：</label><input id="systemName" name="systemName" required><br>
        <label for="masterIp">主机ip：</label><input id="masterIp" name="masterIp" required><br>
        <label for="systemBrand">操作系统品牌及版本：</label><input id="systemBrand" name="systemBrand" required><br>
        <label for="masterAccount">主机登录账号：</label><input id="masterAccount" name="masterAccount" required><br>
        <label for="masterPassword">主机登录密码：</label><input id="masterPassword" name="masterPassword" required><br>
        <label for="storageSpace">存储空间：</label><input id="storageSpace" name="storageSpace" onkeyup="if (isNaN(value)) execCommand('undo')" required><br>
        <label for="memory">内存：</label><input id="memory" name="memory" onkeyup="if (isNaN(value)) execCommand('undo')" required><br>
        <label for="cpuNum">Cpu个数：</label><input id="cpuNum" name="cpuNum" onkeyup="if (isNaN(value)) execCommand('undo')" required><br>
        <label for="cpuCores">Cpu核数：</label><input id="cpuCores" name="cpuCores" onkeyup="if (isNaN(value)) execCommand('undo')" required><br>
        <label for="onPremise">用途：</label>
        <select id="onPremise" name="onPremise">
            <option value="数据库" selected>数据库</option>
            <option value="中间件">中间件</option>
            <option value="Gis">Gis</option>
            <option value="数据库与中间件">数据库与中间件</option>
            <option value="数据库与Gis">数据库与Gis</option>
            <option value="数据库、中间件与Gis">数据库、中间件与Gis</option>
        </select><br>
        <input type="submit" value="新增">
    </form>
</div>
</body>
</html>
