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
    <title>在线用户</title>
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

<script src="lib/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="lib/jquery/jquery.serializejson.min.js" type="text/javascript"></script>
<script src="lib/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<script type="text/javascript">
    let columns = [
        {
            display: '操作', render: function (rowData) {
                return '<a class="stopUser" data-sessionId='+rowData.sessionId+'>下线</a>';
            }
        },
        {display: '用户名', name: 'userName'},
        {
            display: '登陆时间', name: 'loginTime', render: function (rowData) {
                return new Date(rowData.loginTime).toLocaleString();
            }
        },
        {display: '登录ip地址', name: 'host'},
        {
            display: '最后活动事件', name: 'lastViewTime', render: function (rowData) {
                return new Date(rowData.lastViewTime).toLocaleString();
            }
        }

    ];

    $(document).ready(function () {
        loadSheet('#maingrid', columns, '', '/runManage/onlineUser/listOnlineUsers.mvc', '', 'POST');
        $("#maingrid").live('click','.stopUser',function(event){
            let target = event.srcElement||event.target;
            let sessionId = target.getAttribute("data-sessionId");
            $.post('/runManage/onlineUser/stopUser.mvc',{sessionId:sessionId},function(res){
                if (res.success) {
                    $.ligerDialog.success('下线成功');
                } else {
                    $.ligerDialog.error('下线失败,原因:' + res.errorCodes);
                }
            },'json');
        });
        $("#pageloading").hide();

    });
</script>
</body>

</html>