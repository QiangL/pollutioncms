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
    <title>角色管理</title>
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
        <input type="hidden" name="id" id="roleId"/>
        <div class="form-group">
            <label for="roleName" class="col-md-5 control-label">角色名称(非中文)：</label>
            <div class="col-md-7">
                <input id="roleName" name="roleName" type="text" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="roleCnName" class="col-md-5 control-label">角色中文名称：</label>
            <div class="col-md-7">
                <input id="roleCnName" name="roleCnName" type="text" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="comment" class="col-md-5 control-label">备注：</label>
            <div class="col-md-7 ">
                <input id="comment" name="comment" type="text" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="canInherit" class="col-md-5 control-label">能否继承当前角色权限：</label>
            <div class="col-md-7" id="canInherit">
                <div class="col-md-2"></div>
                <label for="canInherit" class="radio-inline col-md-4"><input name="canInherit" type="radio" value="0">不能</label>
                <label for="canInherit" class="radio-inline  col-md-4"><input name="canInherit" type="radio" value="1">能</label>
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
<script src="js/framework/authManage/authCommon.js" type="text/javascript"></script>
<script src="js/framework/authManage/role.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
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
        add('/framework/role/addRole.mvc');
    }

    function updateRole() {
        update('/framework/role/updateRole.mvc', liger.get("maingrid"));
    }

    function deleteRole() {
        delet('/framework/role/deleteRole.mvc', liger.get("maingrid"));
    }

    $(document).ready(function () {
        loadSheet('#maingrid', roleColumns, toolbarItem, '/framework/role/listRoles.mvc', 'GET');
        $("#pageloading").hide();
    });
</script>
</body>

</html>