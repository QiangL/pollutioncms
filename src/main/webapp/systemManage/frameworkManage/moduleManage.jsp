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
    <title>模块管理</title>
    <base href="<%=basePath%>">
    <!-- 重复的内容Starting -->
    <link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css"/>
    <link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css"/>
    <link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css"/>
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="lib/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
</head>

<body style="overflow-x:hidden; padding:2px;width:90%" class="container">
<div class="l-loading" style="display:block" id="pageloading"></div>
<div class="l-clear"></div>

<div class="row">
    <div class="col-md-3">
        模块结构：
        <div id="maintree"></div>
    </div>
    <div class="col-md-9">
        模块下属权限：
        <div id="maingrid"></div>
    </div>
</div>

<form id="form" style="width: 600px;display:none;">
    <div class="form-horizontal">
        <input type="hidden" name="id" id="id"/>
        <input type="hidden" name="pid" id="pid"/>
        <div class="form-group">
            <label for="name" class="col-md-5 control-label">模块名称：</label>
            <div class="col-md-7">
                <input id="name" name="name" type="text" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="permission" class="col-md-5 control-label">模块编码：</label>
            <div class="col-md-7">
                <input id="permission" name="permission" type="text" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="url" class="col-md-5 control-label">模块地址：</label>
            <div class="col-md-7">
                <input id="url" name="url" type="text" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="leaf" class="col-md-5 control-label">是否是叶子节点:</label>
            <div class="col-md-7" id="leaf">
                <div class="col-md-2"></div>
                <label for="leaf" class="radio-inline col-md-4"><input name="leaf" type="radio"
                                                                             value="false">不是</label>
                <label for="leaf" class="radio-inline  col-md-4"><input name="leaf" type="radio"
                                                                              value="true">是</label>
            </div>
        </div>
        <div class="form-group">
            <label for="api" class="col-md-5 control-label">模块是否有页面</label>
            <div class="col-md-7" id="api">
                <div class="col-md-2"></div>
                <label for="api" class="radio-inline col-md-4"><input name="api" type="radio"
                                                                       value="false">是</label>
                <label for="api" class="radio-inline  col-md-4"><input name="api" type="radio"
                                                                        value="true">不是</label>
            </div>
        </div>
        <div class="form-group">
            <label for="comment" class="col-md-5 control-label">备注：</label>
            <div class="col-md-7">
                <input id="comment" name="comment" type="text" class="form-control"/>
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
<script src="lib/ligerUI/js/plugins/ligerTree.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<script src="js/systemManage/authManage/authCommon.js" type="text/javascript"></script>
<script src="js/systemManage/frameworkManage/module.js" type="text/javascript"></script>
<script type="text/javascript">
    let toolbarItem = [
            <shiro:hasPermission name="role:add">{
            id: 'add',
            text: '增加',
            click: addModule,
            icon: 'add'
        }</shiro:hasPermission>
    ];
    let moduleColumns = [
        {display: '操作名', name: 'name'},
        {display: '操作编码', name: 'permission'},
        {display: 'url地址', name: 'url'},
        {display: '备注', name: 'comment'},
        {
            display: '编辑', render: function (rowData) {
                let update = '<shiro:hasPermission name="module:update"><a onclick="updateModule()">修改</a></shiro:hasPermission>';
                let delet = '<shiro:hasPermission name="module:delete"><a onclick="deleteModule()">删除</a></shiro:hasPermission>';
                return update + ' ' + delet;
            }
        }
    ];

    function addModule() {
        add('/framework/module//addModule.mvc', liger.get("maingrid"));
    }

    function deleteModule() {
        delet('/framework/module/deleteModule.mvc', liger.get("maingrid"));
    }

    function updateModule() {
        update('/framework/module//updateModule.mvc', liger.get("maingrid"));
    }


    $(document).ready(function () {
        loadTree('/framework/module/listModules.mvc', '#maintree', function (event) {
            let data = event.data;
            let id = data.id;
            $("#form").find("#pid").val(id);
            loadSheet('#maingrid', moduleColumns, toolbarItem, '/framework/module/listOps.mvc', {parentId: id}, 'GET');
        });
        $("#pageloading").hide();
    });
</script>
</body>

</html>