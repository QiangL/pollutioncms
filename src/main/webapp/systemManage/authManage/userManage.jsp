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

<body style="overflow-x:hidden; padding:2px;width:90%;" class="container">
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
        <shiro:hasPermission name="user:modifyRoles">
            <div class="form-group">
                <label for="roleName" class="col-md-5 control-label">角色：</label>
                <div class="col-md-7 ">
                    <div id="roleNameComboBox"></div>
                </div>
                <div><input id="roleName" name="roleName" type="hidden"></div>
            </div>
        </shiro:hasPermission>
        <div class="form-group">
            <label for="status" class="col-md-5 control-label">用户状态：</label>
            <div class="col-md-7">
                <select class="form-control" id="status" name="status">
                    <option value="NORMAL">正常</option>
                    <option value="LOCKED">锁定</option>
                    <option value="DELETED">删除</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="userSex" class="col-md-5 control-label">用户性别：</label>
            <div class="col-md-7" id="userSex">
                <div class="col-md-2"></div>
                <label for="userSex" class="radio-inline col-md-4"><input name="userSex" type="radio"
                                                                          value="FEMALE">女</label>
                <label for="userSex" class="radio-inline  col-md-4"><input name="userSex" type="radio"
                                                                           value="MALE">男</label>
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
<script src="lib/ligerUI/js/plugins/ligerListBox.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerComboBox.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<script src="js/systemManage/authManage/authCommon.js" type="text/javascript"></script>
<script src="js/systemManage/authManage/user.js" type="text/javascript"></script>
<script type="text/javascript">
    let toolbarItem = [
            <shiro:hasPermission name="role:add">{
            id: 'add',
            text: '增加',
            click: addUser,
            icon: 'add'
        }</shiro:hasPermission>
    ];
    let userColumns = [
        {display: '用户名', name: 'userName', width: 85},
        {display: '用户显示名称', name: 'showName', width: 85},
        {display: '用户角色', name: 'roleNames', width: 85},
        {
            display: '用户状态', width: 60, render: function (rowData) {
                if (rowData.status === 'NORMAL') {
                    return '正常'
                }
                if (rowData.status === 'LOCKED') {
                    return '锁定'
                }
                if (rowData.status === 'DELETED') {
                    return '已删除'
                }
            }
        },
        {
            display: '用户性别', width: 50, name: 'userSex', render: function (rowData) {
                if (rowData.userSex === 'FEMALE') {
                    return "女";
                } else {
                    return "男";
                }
            }
        },
        {display: '用户电话', name: 'userTel', width: 95},
        {display: '用户邮箱', name: 'userEmail', width: 150},
        {display: '用户地址', name: 'userAddr', width: 150},
        {
            display: '最后修改时间', name: 'lastOptTime', width: 150, render: function (rowData) {
                return new Date(rowData.lastOptTime).toLocaleString();
            }
        }, {
            display: '编辑', width: 150, render: function (rowData) {
                let update = '<shiro:hasPermission name="user:update"><a onclick="updateUser()">修改</a></shiro:hasPermission>';
                let delet = '<shiro:hasPermission name="user:delete"><a onclick="deleteUser()">删除</a></shiro:hasPermission>';
                return update + ' ' + delet;
            }
        }
    ];

    function addUser() {
        generateRoleList();
        let form = $("#form");
        form.find("#userName").removeAttr('readOnly');
        form.find("#pwd").attr("required", true);
        form.find("#pwd2").attr("required", true);
        add('/authManage/user/addUser.mvc', liger.get("maingrid"));
    }

    function deleteUser() {
        delet('/authManage/user/deleteUser.mvc', liger.get("maingrid"));
    }

    function updateUser() {
        generateRoleList();
        let form = $("#form");
        form.find("#pwd").attr("required", false);
        form.find("#pwd2").attr("required", false);
        update('/authManage/user/updateUser.mvc', liger.get("maingrid"));
    }

    function modifyRoles() {
        let data = liger.get("maingrid").getSelectedRow();
        let listbox = liger.get("roleModify");
        listbox.setValue(data.roleNames);
        dialog = openDialog("修改用户角色", $("#roleModify-container"));
    }
    function generateRoleList(){
        <shiro:hasPermission name="user:modifyRoles">
        $("#roleNameComboBox").ligerComboBox({
            url: '/authManage/role/queryRoleNames.mvc',
            valueFieldID: 'roleName',
            split: ",",
            valueField: 'id',
            textField: 'text',
            ajaxType: 'GET',
            width:300,
            onSelected: function (value, text) {
                $("#roleName").val(value);
            }
        });
        </shiro:hasPermission>
    }
    $(document).ready(function () {
        loadSheet('#maingrid', userColumns, toolbarItem, '/authManage/user/listUsers.mvc', '', 'GET');
        $("#pageloading").hide();

        /*$("#roleModify-container").attr('style', 'display:none');
        $("#btn-modifyRoleNames").on("click", function () {
            let grid = liger.get('maingrid');
            let userName=grid.getSelectedRow().userName;
            $.ajax('/authManage/user/modifyRoles.mvc',{
                method:'POST',
                data:{'roleNames':$("#modifyRoleNames").val(),'userName':userName},
                dataType:'json',
                contentType:"application/x-www-form-urlencoded",
                success:function (res) {
                    if (res.success) {
                        $.ligerDialog.success('修改成功');
                        liger.get("maingrid").loadData();
                        dialog.hide();
                    } else {
                        $.ligerDialog.error('修改失败,原因:' + res.errorCodes);
                    }
                }
            });
        });*/
    });
</script>
</body>

</html>