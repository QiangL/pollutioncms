<%@ page language="java"
	import="java.util.*,org.easybooks.bookstore.vo.*,org.easybooks.bookstore.dao.impl.*"
	pageEncoding="utf-8"%>
<%@ page import="com.alibaba.fastjson.serializer.SimplePropertyPreFilter" %>
<%@ page import="com.alibaba.fastjson.JSONArray" %>
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

<!-- bootstrap start --> 
<!--  <meta charset="utf-8"> -->
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <!-- bootstrap end --> 
 
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
<link href="bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
<link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css" />
<script src="lib/jquery/jquery-3.0.0.js" type="text/javascript"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>

<style>
 a{text-decoration:none;}
</style>

</head>
  

<%
 Object obj =request.getAttribute("signList");
 /*JsonConfig con = new JsonConfig();
 con.setExcludes(new String[]{"user"});
 JSONArray m1Json = JSONArray.fromObject(obj,con);*/
 //用作 字段过滤 实现和上面一样的功能
SimplePropertyPreFilter filter = new SimplePropertyPreFilter(Sign.class, "signId","signTitle","signText","signState");
String m1Json=JSONArray.toJSONString(obj,filter);
 %>
 
  <body style="overflow-x:hidden; padding:2px;">
    
       <form  method="post" name="myform">
         <div>
           <div>使用个性签名：
           <input name="_sign" id="_sign" type="hidden">
		   <select name="sign" id="sign" style="width:150px;height:30px" onchange="changeItem(this);">

			     <s:iterator value="signList" var="sl">
			     	 		<s:if test="#sl.signState=='open'">
			                  <option selected="selected">
			                  <s:property  value="#sl.signTitle" />  
			                  </option> 
			                 </s:if>
			                 <s:else>
			                 <option>
			                  <s:property value="#sl.signTitle" />  
			                  </option> 
			                 </s:else>       
			     </s:iterator>
              </select>
             <button type="button" onclick="show()" >添加个性签名</button>
            
           </div>
           <br><br>
           <div>签名内容:</div>
           <div><textarea id="signText" name="signText" style="width:60%;height:200px;border:1px black solid">
                      
           </textarea></div>
          <br><br>
		  <input type="submit" value="确定" name="update" onclick="helpSubmit(this)" style="width:80px;height:30px;">
		  <input type="submit" value="删除" name="delete" onclick="helpSubmit(this)" style="width:80px;height:30px;">	
         </div>
       </form>


	<Script>
	
	var signid;
	var signtitle;	

    var m1JSON = '<%=m1Json %>';
    var m1Obj = $.parseJSON(m1JSON);

   	for(var s in m1Obj){
		if(m1Obj[s].signState == 'open') 
		{
		
		 $('#signText').val(m1Obj[s].signText);
		
		 signid = m1Obj[s].signId;
		 signtitle = m1Obj[s].signTitle;

		}
	}  

		function changeItem(obj){
		  var s = obj.options[obj.options.selectedIndex];//.signTitle;
		  var m = s.index;   //被选中的标题的索引；0，1，2，3.。。
		 signid = m1Obj[m].signId;
		 signtitle = m1Obj[m].signTitle;
		 $('#signText').val(m1Obj[m].signText);//

		 //alert(m);   
		}
		
	function helpSubmit(button){
		if(button.name == "update"){
		
			if(signtitle == '未使用') 
				 $('#signText').val("");
 			document.myform.action="updateSign.action";
 			
			 $('#_sign').val(signid);
			document.myform.submit();
		}else{
		
			if(signtitle == '未使用')  $('#signText').val("");
			document.myform.action="deleteSign.action";
			 $('#_sign').val(signid);
			document.myform.submit();
		}
	}
	
	function show(){

		$('#exampleModal').modal('show');
	}
	
	</Script>
	
	
<div class="modal fade" id="exampleModal" >
  <div class="modal-dialog" >
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" ></button>
        <h4 class="modal-title" id="exampleModalLabel">添加个性签名</h4>
      </div>
      <div class="modal-body">
        <form method="post" action="addSign.action" >
          <div class="form-group">
            <label for="recipient-name" class="control-label">标题</label>
            <input type="text" class="form-control" id="title" name="title">
          </div>
          <div class="form-group">
            <label for="message-text" class="control-label">内容</label>
            <textarea class="form-control" style="height:200px" id="text" name="text"></textarea>
          </div>
        <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <input type="submit" class="btn btn-primary" value="保存">
      </div>
        </form>
      </div>

    </div>
  </div>
</div>
	
 </body>
    

</html>
