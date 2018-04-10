<%@ page language="java" import="java.util.*,org.easybooks.bookstore.vo.*,org.easybooks.bookstore.dao.impl.*,net.sf.json.JSONArray,net.sf.json.JSONObject" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>报警日志</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- 重复的内容Starting -->
	
	<link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
    <link href="lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
    <link href="lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet" type="text/css" />
    <script src="lib/jquery/jquery-1.4.4.min.js" type="text/javascript"></script> 
    <script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script> 
    <script src="lib/ligerUI/js/plugins/ligerGrid.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
    
     <%
        System.out.println("Alarmlogging.jsp starting!");
      %>
      
     
     
     
     
     
    <% String strArray=request.getAttribute("Alarmlogging_strJSONArray").toString(); %>
    <% String alarmRegular_size = request.getAttribute("Alarmlogging_size").toString(); 
       int alarmRegularSize = Integer.parseInt(alarmRegular_size);
    %>
	
	<script type="text/javascript">
	
    var Data = {Rows:<%=strArray %>,Total:<%= alarmRegularSize %>};
   
        function itemclick(item)
        {
            alert(item.text);
        }
        
        $(function ()
        {
            window['g'] =
            $("#maingrid").ligerGrid({
                height:'100%',
                columns: [
                { display: '处理状态', name: 'alaState'},
                { display: '排口名称', name: 'alaOutName'},
                { display: '报警时间', name: 'alaTime' },
                { display: '报警类型', name: 'alaType' },
                { display: '污染物名称', name: 'alaWrwName' },
                { display: '污染物值', name: 'alaWrwValue' },
                { display: '报警上限', name: 'alaUpper'},
                { display: '报警上限', name: 'alaLower'}
                ], data:Data,  pageSize:30 ,rownumbers:true,toolbarShowInLeft:false,
                toolbar: { items: [
                { text: '增加', click: itemclick, icon: 'add' },
                { line: true },
                { text: '修改', click: itemclick, icon: 'modify' },
                { line: true },
                { text: '删除', click: itemclick, img: 'lib/ligerUI/skins/icons/delete.gif' },
                { line:true },
                { text: '查看', click: itemclick, img: 'lib/ligerUI/skins/icons/view.gif'}
                ]
                }
            });
             

            $("#pageloading").hide();
        });

        function deleteRow()
        {
            g.deleteSelectedRow();
        }
    </script>
	
	<!-- 重复的内容End -->

  </head>
  
<body style="overflow-x:hidden; padding:2px;">
<div class="l-loading" style="display:block" id="pageloading"></div>
 <a class="l-button" style="width:120px;float:left; margin-left:10px; display:none;" onclick="deleteRow()">删除选择的行</a>

 
 <div class="l-clear"></div>

    <div id="maingrid"></div>
   
  <div style="display:none;">
  
</div>
</body>
</html>
