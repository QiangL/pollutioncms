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
<form id="form">
    <div class="form-horizontal">
        <input type="hidden" name="id" id="userId"/>
        <div class="form-group">
            <label for="userName" class="col-md-3 control-label">用户名(登陆用，非中文)：</label>
            <div class="col-md-7">
                <input id="userName" name="userName" type="text" required="true" class="form-control"
                       value="${user.userName}" readonly/>
            </div>
        </div>
        <div class="form-group">
            <label for="pwd" class="col-md-3 control-label">密码：</label>
            <div class="col-md-7">
                <input id="pwd" name="pwd" type="password" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="pwd2" class="col-md-3 control-label">重复密码：</label>
            <div class="col-md-7">
                <input id="pwd2" name="pwd2" type="password" required="true" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label for="showName" class="col-md-3 control-label">用户显示名称：</label>
            <div class="col-md-7">
                <input id="showName" name="showName" type="text" required="true" class="form-control"
                       value="${user.showName}"/>
            </div>
        </div>
        <div class="form-group">
            <label for="status" class="col-md-3 control-label">用户状态：</label>
            <div class="col-md-7">
                <select class="form-control" id="status" name="status">
                    <option value="NORMAL" <c:if test="user.status==NORMAL">selected</c:if>>正常</option>
                    <option value="LOCKED" <c:if test="user.status==LOCKED">selected</c:if>>锁定</option>
                    <option value="DELETED" <c:if test="user.status==DELETED">selected</c:if>>删除</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="userSex" class="col-md-3 control-label">用户性别：</label>
            <div class="col-md-7" id="userSex">
                <div class="col-md-2"></div>
                <label for="userSex" class="radio-inline col-md-4">
                    <input name="userSex" type="radio" value="FEMALE">女
                </label>
                <label for="userSex" class="radio-inline  col-md-4">
                    <input name="userSex" type="radio" value="MALE">男
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="userTel" class="col-md-3 control-label">用户电话：</label>
            <div class="col-md-7 ">
                <input id="userTel" name="userTel" type="tel" class="form-control" value="${user.userTel}"/>
            </div>
        </div>
        <div class="form-group">
            <label for="userEmail" class="col-md-3 control-label">用户邮箱：</label>
            <div class="col-md-7 ">
                <input id="userEmail" name="userEmail" type="email" class="form-control" value="${user.userEmail}"/>
            </div>
        </div>
        <div class="form-group">
            <label for="userAddr" class="col-md-3 control-label">用户地址：</label>
            <div class="col-md-7 ">
                <input id="userAddr" name="userAddr" type="text" class="form-control" value="${user.userAddr}"/>
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
<script src="js/common.js" type="text/javascript"></script>
<script src="js/systemManage/authManage/authCommon.js" type="text/javascript"></script>
<script src="js/systemManage/authManage/user.js" type="text/javascript"></script>
<script type="text/javascript">

    $(document).ready(function () {
        $("#btn-modifyRoleNames").on("click", function () {
            let grid = liger.get('maingrid');
            let userName = grid.getSelectedRow().userName;
            $.ajax('/authManage/user/motifyRoles.mvc', {
                method: 'POST',
                data: {'roleNames': $("#motifyRoleNames").val(), 'userName': userName},
                dataType: 'json',
                contentType: "application/x-www-form-urlencoded",
                success: function (res) {
                    if (res.success) {
                        $.ligerDialog.success('修改成功');
                        liger.get("maingrid").loadData();
                        dialog.hide();
                    } else {
                        $.ligerDialog.error('修改失败,原因:' + res.errorCodes);
                    }
                }
            });
        });
    });
</script>
</body>

</html>