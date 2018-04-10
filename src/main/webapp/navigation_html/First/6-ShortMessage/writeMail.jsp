<%@ page language="java"
	import="java.util.*,org.easybooks.bookstore.vo.*,org.easybooks.bookstore.dao.impl.*,net.sf.json.JSONArray,net.sf.json.JSONObject"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'sendMail.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
<link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css" />
<script src="lib/jquery/jquery-1.4.4.min.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>


<style>
    #all{float:left;width:100%;height:100%}
    #left{float:left;width:80%;height:100%}
    #right{float:left;width:19%;height:79%;border:1px black solid;overflow-y:scroll;overflow-x:none}
</style>


</head>

<body style="overflow-x:hidden; padding:2px;">

	<br><br><br><br>
	<form action="sendMail.action" method="post">
		<div id="left">
			<div>发送人</div>
			<div>websystem</div>
			<br><br><br>
			<div>收件人</div>
			<textarea id="dest_email" name="dest_email" id="dest_email" style="width:90%;height:30px;border:1px black solid"></textarea>
			<br><br><br><br>
			<div>主题</div>
		
			<textarea id="tal" name="subject" style="width:90%;height:30px;border:1px black solid"></textarea>
			<br><br><br><br>
			<div>内容</div>
			
			<textarea id="content" name="content" style="width:90%;height:200px;border:1px black solid">
			</textarea>
			<br><br><br><br>
			<input type="submit" value="发送" style="width:100px;height:30px;">	
		</div>
		
			
 		<div id="right">   
			<table align="center" style="font-size:13px;border-collapse:separate;border-spacing:0px 10px">
				<tr>
					<th style="text-align:center">联系人</th>
				</tr>
				<s:iterator value="#contactList" id="ct">
				<tr>
					<td onclick=addToDest_email(this)>
						  <s:property value="#ct.conName"/>       
						  <s:property value="(#ct.conMail)"/>
					 </td>
				</tr>				
				</s:iterator>
			</table>
		</div>
	</form>
	
	<Script>
	
	var sign = '<%=request.getAttribute("openSign") %>';
	
	var presign = "\n\n\n\n\n\n-----------------\n";
	
	$('#content').val(presign + sign);
	
	
	function addToDest_email(td){
		var ss =  td.innerText.split(' ');
		var str = $('#dest_email').val() + ss[1] + ';';//
	      $('#dest_email').val(str);//
	}

</Script>

</body>






</html>
