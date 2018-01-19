<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>部署系统详情</title>
</head>
<body>
<div style="text-align: center">
    <label for="systemName">系统名称：</label><input id="systemName" name="systemName" value="${deploy.master.systemName}"><br>
    <label for="url">系统访问url：</label><input id="url" name="url" type="url" value="${deploy.url}"><br>
    <label for="industry">行业：</label><input id="industry" name="industry" value="${deploy.industry}"><br>
    <label for="deploymentServices">部署部门：</label><input id="deploymentServices" name="deploymentServices" value="${deploy.deploymentServices}"><br>
    <label for="deploymentInterfacePeople">部署接口人：</label><input id="deploymentInterfacePeople" name="deploymentInterfacePeople" value="${deploy.deploymentInterfacePeople}"><br>
    <label for="contact">联系方式：</label><input id="contact" name="contact" type="tel" value="${deploy.contact}"><br>
    <label for="browser">演示要求浏览器：</label><input id="browser" name="browser" value="${deploy.browser}"><br>
    <label for="manual">用户手册：</label><input id="manual" name="manual" type="file" value="${deploy.manual}"><br>
    <label for="script">演示脚本：</label><input id="script" name="script" type="file" value="${deploy.script}"><br>
    <label for="systemSynopsis">系统简介：</label><input id="systemSynopsis" name="systemSynopsis" value="${deploy.systemSynopsis}"><br>
    <input type="submit" value="修改">&nbsp;&nbsp;&nbsp;<input type="button" value="返回" onclick="history.back();">
</div>
</body>
</html>
