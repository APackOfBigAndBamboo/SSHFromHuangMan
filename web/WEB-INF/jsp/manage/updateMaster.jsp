<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主机修改</title>
</head>
<body>
<div style="text-align: center">
    <form action="updateMaster.action" method="post">
        <label hidden for="systemName">id：</label><input hidden id="id" name="id" value="${tbMaster.id}" required>&nbsp;&nbsp;&nbsp;
        <label for="systemName">系统名称：</label><input id="systemName" name="systemName" value="${tbMaster.systemName}" required>&nbsp;&nbsp;&nbsp;
        <label for="masterIp">主机ip：</label><input id="masterIp" name="masterIp" value="${tbMaster.masterIp}" required>&nbsp;&nbsp;&nbsp;<label for="systemBrand">操作系统品牌及版本：</label><input id="systemBrand" name="systemBrand" value="${tbMaster.systemBrand}" required><br>
        <label for="masterAccount">主机登录账号：</label><input id="masterAccount" name="masterAccount" value="${tbMaster.masterAccount}" required>&nbsp;&nbsp;&nbsp;<label for="masterPassword">主机登录密码：</label><input id="masterPassword" name="masterPassword" value="${tbMaster.masterPassword}" required><br>
        <label for="storageSpace">存储空间：</label><input id="storageSpace" name="storageSpace" value="${tbMaster.storageSpace}" onkeyup="if (isNaN(value)) execCommand('undo')" required>&nbsp;&nbsp;&nbsp;<label for="memory">内存：</label><input id="memory" name="memory" value="${tbMaster.memory}" onkeyup="if (isNaN(value)) execCommand('undo')" required><br>
        <label for="cpuNum">cpu个数：</label><input id="cpuNum" name="cpuNum" value="${tbMaster.cpuNum}" onkeyup="if (isNaN(value)) execCommand('undo')" required>&nbsp;&nbsp;&nbsp;<label for="cpuCores">cpu核数：</label><input id="cpuCores" name="cpuCores" value="${tbMaster.cpuCores}" onkeyup="if (isNaN(value)) execCommand('undo')" required><br>
        <label for="onPremise">用途：</label>
        <select id="onPremise" name="onPremise">
            <option value="数据库">数据库</option>
            <option value="中间件">中间件</option>
            <option value="Gis">Gis</option>
            <option value="数据库与中间件">数据库与中间件</option>
            <option value="数据库与Gis">数据库与Gis</option>
            <option value="数据库、中间件与Gis">数据库、中间件与Gis</option>
        </select>
        <input type="submit" value="保存">&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="history.back();">
    </form>
</div>
</body>
</html>
