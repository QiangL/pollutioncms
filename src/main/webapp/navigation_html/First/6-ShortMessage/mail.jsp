<%@ page language="java" import="java.util.*,org.easybooks.bookstore.vo.*,org.easybooks.bookstore.dao.impl.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mail.jsp' starting page</title>
    
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
    <script src="lib/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerToolBar.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerComboBox.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerDateEditor.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/plugins/ligerSpinner.js" type="text/javascript"></script>

    

      <% String strArray=request.getAttribute("Mail_strJSONArray").toString(); %>
      <% String mail_size = request.getAttribute("Mail_size").toString(); 
       int mailSize = Integer.parseInt(mail_size); %>
    
    
    <script type="text/javascript">
   
    var item;
    var ma = '<%=strArray%>';
    ma = ma.replace(/\ +/g,"");   //去掉空格
    ma = ma.replace(/[\r\n]/g,"");  //去掉回车换行
    var mymail = $.parseJSON(ma);    

    var Data = {Rows:<%=strArray %>,Total:<%= mailSize %>};

        var mail;
        $(function ()
        {

           mail = $("#maingrid").ligerGrid({
              // checkbox:true,
                height:'100%',
                columns: [
                { display: '主题', name: 'mailSubject', align: 'left', width: 100, minWidth: 60 },
                { display: '内容', name: 'mailText', minWidth: 120 },
                { display: '发送者', name: 'mailSendName' },
                { display: '发送者邮箱', name: 'mailSendMail' },
                { display: '收件人', name: 'mailRecName' },
                { display: '收件人邮箱', name: 'mailRecMail' },
                { display: '发送时间', name: 'mailTime'},
                {display: '操作', align: 'left', isSort: false, width: 55, render: function (rowData, rowindex, value)
                    {
                         var h="";
                         h = "<button onclick='javascript:deleteSelected("+ rowindex +")'>删除</button>";
                         return h;
                    }
                },
                ],data:Data,  pageSize:30 ,rownumbers:true,
                           
             });
             

             $("#pageloading").hide();
        });

function deleteSelected(rowid){
     if (confirm('确定删除?'))
 	      {
 	          $('#mailId').val(mymail[rowid].mailId);	          
 	          $('#delMa').submit(); 
 	         // alert(mailId);
 	      }
}

     </script>
	
    
  </head>
  

<body style="overflow-x:hidden; padding:2px;">

<form id="delMa" name="delMa" method="post" action="deleteMail">
   	<input type="hidden" name="mailId" id="mailId"/>
</form>

<div class="l-loading" style="display:block" id="pageloading"></div>
<!--  <a class="l-button" style="width:120px;float:left; margin-left:10px; display:none;" onclick="deleteRow()">删除选择的行</a> -->

    <div id="maingrid"></div>

  <div style="display:none;">
  
</div>
</body>

</html>
