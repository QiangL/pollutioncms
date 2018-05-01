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

<body style="overflow-x:hidden; padding:2px;" class="container">
<div class="l-loading" style="display:block" id="pageloading"></div>
<div class="l-clear"></div>

<div class="row">
    <div  class="col-md-3">
        角色列表：
        <div id="allRoles"></div>
        <input type="button" id="btn-submitTree" value="提交" class="btn btn-warning"/>
    </div>
    <div class="col-md-4">
        所有模块权限：
        <div id="allAuths"></div>
    </div>
    <div class="col-md-4">
        <div id="newAuths"></div>
    </div>

</div>

<script src="lib/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="lib/jquery/jquery.serializejson.min.js" type="text/javascript"></script>
<script src="lib/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerListBox.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerTree.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerDrag.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerMenu.js" type="text/javascript"></script>
<script src="lib/ligerUI/draggable.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<script type="text/javascript">
    function newTree(data) {
        var menu = $.ligerMenu({
            width: 120, items:
                [
                    {text: '删除', click: deleteItem, icon: 'delete'}
                ]
        });
        var actionNode;
        function deleteItem() {
            if (actionNode)
                liger.get("newAuths").remove(actionNode);
        }

        let newTree = $("#newAuths").ligerTree({
            nodeDraggable: allAuths,
            data: data,
            idFieldName: 'id',
            parentIDFieldName: 'pid',
            onContextmenu: function (node, e) {
                actionNode = node.data;
                menu.show({top: e.pageY, left: e.pageX});
                return false;
            }
        });
        treeDraggable(liger.get('allAuths'), newTree);
    }

    $(document).ready(function () {
        $("#btn-newTree").on('click', function () {
            newTree();
        });
        loadTree('/framework/navigation/listAllAuths.mvc', "#allAuths", function () {
            //nothings
        });
        $("#allRoles").ligerListBox({
            height: 250,
            width: 250,
            isShowCheckBox: true,
            isMultiSelect: false,
            url: '/authManage/role/queryRoleNames.mvc',
            valueFieldID: 'roleName',
            split: ",",
            ajaxType: 'GET',
            onSelected: function () {
                $.get('/framework/navigation/listRoleAuths.mvc', {'roleName': $("#roleName").val()}, function (data) {
                    newTree(data);
                }, 'json');
            }
        });

        $("#btn-submitTree").on("click", function () {
            let roleName = $("#roleName").val();
            if (!roleName) {
                $.ligerDialog.error('请选择修改导航的角色');
                return;
            }
            let newAuthsTree = liger.get('newAuths');
            let newNav = newAuthsTree.getData();
            $.ajax('/framework/navigation/updateNavigation.mvc', {
                method: 'POST',
                data: JSON.stringify({'roleName': roleName, 'ids': newNav}),
                dataType: 'json',
                contentType: "application/json",
                success: function (res) {
                    if (res.success) {
                        $.ligerDialog.success('修改成功');
                    } else {
                        $.ligerDialog.error('修改失败,原因:' + res.errorCodes);
                    }
                }
            });
        });
        $("#pageloading").hide();
    });
</script>
</body>

</html>