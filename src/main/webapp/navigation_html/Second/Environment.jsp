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
    
    <title>环境属性</title>
    
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
        System.out.println("OnlineTable.jsp starting!");
      %>
      
     
     
     
     
     
    <% String strArray=request.getAttribute("Environments_strJSONArray").toString(); %>
    <% String size = request.getAttribute("Environments_size").toString(); 
       int Size = Integer.parseInt(size);
    %>
	
	<script type="text/javascript">
	
    var Data = {Rows:<%=strArray %>,Total:<%= Size %>};
   
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
                { display: '企业编号', name: 'Env_Ent_No', align: 'left', width: 100, minWidth: 60 },
                { display: '流域', name: 'Env_watershed', minWidth: 120 },
                { display: '地区', name: 'Env_region' },
                { display: '污水处理工艺', name: 'Env_sewage_treatment_craft' },
                { display: '治理设施处理能力', name: 'Env_facilities_ability' },
                { display: '污水产生类别', name: 'Env_sewage_class' },
                { display: '直排入海量', name: 'Env_sea' },
                { display: '直排入江河湖库量', name: 'Env_river' },
                { display: '水域功能区类别', name: 'Env_waters_function' },
                { display: '海域功能区类别', name: 'Env_sea_function' },
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
