<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>角色管理</title>
    <base href="<%=basePath%>">
    <!-- 重复的内容Starting -->
    <link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css"/>
    <link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css"/>
    <link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css"/>
    <script src="lib/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
    <script src="js/framework/authManage/role.js" type="text/javascript"></script>
    <script src="js/common.js" type="text/javascript"></script>
</head>

<body style="overflow-x:hidden; padding:2px;">
<div class="l-loading" style="display:block" id="pageloading"></div>
<a class="l-button" style="width:120px;float:left; margin-left:10px; display:none;" onclick="deleteRow()">删除选择的行</a>


<div class="l-clear"></div>

<div id="maingrid"></div>

<div style="display:none;">

</div>
<script type="text/javascript">
    var toolbarItem = [
        <shiro:hasPermission name="role:add">{id: 'add', text: '增加', click: addRole, icon: 'add'},</shiro:hasPermission>
        <shiro:hasPermission name="role:update">{id: 'update', text: '修改', click: updateRole, icon: 'modify'},</shiro:hasPermission>
        <%--<shiro:hasPermission name="role:delete">{id: 'delete', text: '删除', click: deleteRole, img: 'lib/ligerUI/skins/icons/delete.gif'},</shiro:hasPermission>--%>
        {id: 'delete', text: '删除', click: deleteRole, img: 'lib/ligerUI/skins/icons/delete.gif'},
        {line:true}
    ];
    $(document).ready(function () {
        loadSheet('#maingrid', roleColumns, toolbarItem, '/framework/role/listRoles.mvc', 'GET');
        $("#pageloading").hide();
    });
</script>
</body>

</html>