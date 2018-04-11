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
    
    <title>My JSP 'contacts.jsp' starting page</title>
    
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
<script src="lib/ligerUI/js/plugins/ligerComboBox.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerDateEditor.js" type="text/javascript"></script>
<script src="lib/ligerUI/js/plugins/ligerSpinner.js" type="text/javascript"></script>




      <% String strArray=request.getAttribute("Contacts_strJSONArray").toString(); %>
      <% String contacts_size = request.getAttribute("Contacts_size").toString(); 
       int contactsSize = Integer.parseInt(contacts_size); %>
    

    <script type="text/javascript">

   var item; 
   var con = '<%=strArray %>';
   var mycon = $.parseJSON(con);

   var Data = {Rows:<%=strArray %>,Total:<%= contactsSize %>};
   
        var contacts,g;
        $(function ()
        {
            
           g = contacts = $("#maingrid").ligerGrid({
                height:'100%',
                columns: [                                      
                { display: '联系人', name: 'conName'},
                { display: '联系人电话', name: 'conTel', minWidth: 120 },
                { display: '邮箱', name: 'conMail' },
                { display: '联系人公司', name: 'conCompany' },
                { display: '联系人部门', name: 'conDivision' },
                { display: '联系人职位', name: 'conPost' },
                                
                {display: '操作', align: 'left', isSort: false, width: 88, render: function (rowData, rowindex, value)               
                {
                    var h="";
                //    if(!rowData._editing);
                    {
                       h += "<button onclick='javascript:updateRow("+ rowindex +")'>修改</button>";
                       h += "<button onclick='javascript:deleteSelected("+ rowindex +")'>删除</button>";
                    }
                    return h;
                }
                },  
                ], data:Data,  pageSize:30 ,rownumbers:true,              
                               
                 });
                          

            $("#pageloading").hide();
        });

             
        function show(){                 //实现添加操作；		
		$('#addContacts').modal('show');	  
	    }
	    
	
        function updateRow(rowid){              //实现修改数据更新操作；
        $('#Id').val(mycon[rowid].conId);       //得到当前行的联系人ID；
        $('#Name').val(mycon[rowid].conName);
        $('#Tel').val(mycon[rowid].conTel);
        $('#Email').val(mycon[rowid].conMail);
        $('#Company').val(mycon[rowid].conCompany);
        $('#Division').val(mycon[rowid].conDivision);
        $('#Post').val(mycon[rowid].conPost);
        $('#updateContacts').modal('show');  
        }	
            
 	    function deleteSelected(rowid){        //实现删除操作
 	      if (confirm('确定删除?'))
 	      {
 	        //contacts.deleteRow(rowid);
 	       $('#conId').val(mycon[rowid].conId);
 	          $('#delCt').submit(); 	        
 	      }
 	    }
// }
    </script>
        
  </head>
  

<body style="overflow-x:hidden; padding:2px;">

   <form id="delCt" name="delCt" method="post" action="deleteContact">
   		<input type="hidden" name="conId" id="conId"/>
   </form>

<div class="l-loading" style="display:block" id="pageloading"></div>
 
<div class="l-clear"></div>

<div align="right"> <button type="button" onclick="show()">添加联系人</button></div>
 <br>

<div id="maingrid"></div>
   
<div style="display:none;"></div>


<div class="modal fade" id="addContacts" >
  <div class="modal-dialog" >
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" ></button>
        <h4 class="modal-title" id="addContactsLabel">添加新建联系人</h4>
      </div>
      <div class="modal-body">
        <form method="post" action="addContacts.action" >
          <div class="form-group">
            <label for="recipient-name" class="control-label">姓名</label>
            <input type="text" class="form-control" id="name" name="name">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">联系电话</label>
            <input type="text" class="form-control" id="tel" name="tel">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">邮箱</label>
            <input type="text" class="form-control" id="email" name="email">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">公司</label>
            <input type="text" class="form-control" id="company" name="company">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">部门</label>
            <input type="text" class="form-control" id="division" name="division">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">职位</label>
            <input type="text" class="form-control" id="post" name="post">
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
  
  <div class="modal fade" id="updateContacts" >
  <div class="modal-dialog" >
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" ></button>
        <h4 class="modal-title" id="updateContactsLabel">修改当前联系人信息</h4>
      </div>
      <div class="modal-body">
        <form method="post" name="conform" action="updateContacts.action" >
          <div class="form-group">
            <label for="recipient-name" class="control-label">ID</label>
            <input type="text" readonly="readonly" class="form-control" id="Id" name="Id">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">姓名</label>
            <input type="text" class="form-control" id="Name" name="Name">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">联系电话</label>
            <input type="text" class="form-control" id="Tel" name="Tel">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">邮箱</label>
            <input type="text" class="form-control" id="Email" name="Email">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">公司</label>
            <input type="text" class="form-control" id="Company" name="Company">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">部门</label>
            <input type="text" class="form-control" id="Division" name="Division">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">职位</label>
            <input type="text" class="form-control" id="Post" name="Post">
          </div>
        <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <input type="submit" class="btn btn-primary" value="确定">
      </div>
       </form>
      </div>

    </div>
  </div>
</div>
 </body>

</html>
