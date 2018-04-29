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
                <label for="canInherit" class="radio-inline col-md-4"><input name="canInherit" type="radio"
                                                                             value="CANNOT_INHERIT">不能</label>
                <label for="canInherit" class="radio-inline  col-md-4"><input name="canInherit" type="radio"
                                                                              value="CAN_INHERIT">能</label>
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
<script src="js/systemManage/authManage/authCommon.js" type="text/javascript"></script>
<script src="js/systemManage/authManage/role.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<script type="text/javascript">
    let toolbarItem = [
            <shiro:hasPermission name="role:add">{
            id: 'add',
            text: '增加',
            click: addRole,
            icon: 'add'
        }</shiro:hasPermission>
    ];
    let roleColumns = [
        {display: '角色名', name: 'roleName'},
        {display: '角色中文名', name: 'roleCnName'},
        {display: '角色说明', name: 'comment'},
        {
            display: '编辑', render: function (rowData) {
                let update='<shiro:hasPermission name="role:update"><a onclick="updateRole()">修改</a></shiro:hasPermission>';
                let delet='<shiro:hasPermission name="role:delete"><a onclick="deleteRole()">删除</a></shiro:hasPermission>';
                return update+' '+delet;
            }
        }
    ];

    function addRole() {
        add('/authManage/role/addRole.mvc', liger.get("maingrid"));
    }
    function updateRole(){
        update('/authManage/role/updateRole.mvc', liger.get("maingrid"));
    }
    function deleteRole(){
        delet('/authManage/role/deleteRole.mvc', liger.get("maingrid"));
    }
    $(document).ready(function () {
        loadSheet('#maingrid', roleColumns, toolbarItem, '/authManage/role/listRoles.mvc', '','GET');
        $("#pageloading").hide();
    });
</script>
</body>

</html>