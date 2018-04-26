<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <base href="<%=basePath%>">
    <!-- 重复的内容Starting -->
    <link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css"/>
    <link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css"/>
    <link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css"/>
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="lib/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
</head>

<body style="overflow-x:hidden; padding:2px;" class="container">
<div class="l-loading" style="display:block" id="pageloading"></div>
<div class="l-clear"></div>

<div id="maingrid"></div>

<form id="form" style="width: 600px;display:none;">
    <div class="form-horizontal">
        <input type="hidden" name="id" id="userId"/>
        <div class="form-group">
            <label for="userName" class="col-md-5 control-label">用户名(登陆用，非中文)：</label>
            <div class="col-md-7">
                <input id="userName" name="userName" type="text" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="pwd" class="col-md-5 control-label">密码：</label>
            <div class="col-md-7">
                <input id="pwd" name="pwd" type="password" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="pwd2" class="col-md-5 control-label">重复密码：</label>
            <div class="col-md-7">
                <input id="pwd2" name="pwd2" type="password" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="showName" class="col-md-5 control-label">用户显示名称：</label>
            <div class="col-md-7">
                <input id="showName" name="showName" type="text" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="userSex" class="col-md-5 control-label">用户性别：</label>
            <div class="col-md-7" id="userSex">
                <div class="col-md-2"></div>
                <label for="userSex" class="radio-inline col-md-4"><input name="userSex" type="radio" value="FEMALE">女</label>
                <label for="userSex" class="radio-inline  col-md-4"><input name="userSex" type="radio" value="MALE">男</label>
            </div>
        </div>
        <div class="form-group">
            <label for="userTel" class="col-md-5 control-label">用户电话：</label>
            <div class="col-md-7 ">
                <input id="userTel" name="userTel" type="tel" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="userEmail" class="col-md-5 control-label">用户邮箱：</label>
            <div class="col-md-7 ">
                <input id="userEmail" name="userEmail" type="email" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
        <label for="userAddr" class="col-md-5 control-label">用户地址：</label>
        <div class="col-md-7 ">
            <input id="userAddr" name="userAddr" type="text" class="form-control"/>
        </div>
    </div>
        <div class="form-group">
            <div class="col-md-7"></div>
            <input type="submit" id="submit" class="btn btn-warning" value="提交"/>
        </div>
    </div>
</form>
<script src="lib/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="lib/jquery/jquery.serializejson.min.js" type="text/javascript"></script>
<script src="lib/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<script src="js/framework/authManage/authCommon.js" type="text/javascript"></script>
<script src="js/framework/authManage/user.js" type="text/javascript"></script>
<script type="text/javascript">
    var toolbarItem = [
            <shiro:hasPermission name="role:add">{
            id: 'add',
            text: '增加',
            click: addRole,
            icon: 'add'
        }, </shiro:hasPermission>
            <shiro:hasPermission name="role:update">{
            id: 'update',
            text: '修改',
            click: updateRole,
            icon: 'modify'
        }, </shiro:hasPermission>
            <shiro:hasPermission name="role:delete">{
            id: 'delete',
            text: '删除',
            click: deleteRole,
            img: 'lib/ligerUI/skins/icons/delete.gif'
        }, </shiro:hasPermission>
    ];

    function addRole() {
        add('/framework/user/addUser.mvc', liger.get("maingrid"));
    }

    function updateRole() {
        update('/framework/user/updateUser.mvc', liger.get("maingrid"));
    }

    function deleteRole() {
        delet('/framework/user/deleteUser.mvc', liger.get("maingrid"));
    }

    $(document).ready(function () {
        loadSheet('#maingrid', userColumns, toolbarItem, '/framework/user/listUsers.mvc', 'GET');
        $("#pageloading").hide();
    });
</script>
</body>

</html>