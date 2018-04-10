<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
/*  a{text-decoration:none} */
.p{font-family:"微软雅黑", "黑体", "华文细黑"; font-size:16px; color:#000000;}
</style>
  </head>
  
  <body>
  <br><br>
      <div class="p">邮件发送成功！</div>
   <br><br>
      <div>
       <a href="welcome.htm"><input type="submit" value="返回首页"/></a> 
<!--        <a href="contacts.jsp"><input type="submit" value="查看通讯簿"/></a>  -->
       <input type="button" onclick="javascript:window.location.href='\navigation_html\First\6-ShortMessage\writeMail.jsp'" value="再写一封"/> 
       
      </div>   
  </body>
</html>
