<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>演示</title>
</head>
<body>
<div style="text-align: center">
    <form action="${deploy.url}" method="post">
        <label for="id" hidden>id：</label><input hidden id="id" name="id" value="${deploy.id}" readonly><br>
        <label for="browser">演示要求浏览器：</label><input id="browser" name="browser" value="${deploy.browser}"><br>
        <label for="systemName">系统名称：</label><input id="systemName" name="systemName" value="${deploy.master.systemName}" readonly><br>
        <label for="systemSynopsis">系统简介：</label><input id="systemSynopsis" name="systemSynopsis" value="${deploy.systemSynopsis}" readonly><br>
        <label for="manual">用户手册：</label><input id="manual" name="manual" value="${deploy.manual}" readonly><br>
        <label for="script">演示脚本：</label><input id="script" name="script" value="${deploy.script}" readonly><br>
        <label for="contact">系统支持人员（+电话）：</label><input id="contact" name="contact" value="${deploy.deploymentInterfacePeople}+${deploy.contact}" readonly><br>
        <a href="${deploy.url}" target="_blank">进入演示</a>&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="history.back();">
    </form>
</div>
</body>
</html>
