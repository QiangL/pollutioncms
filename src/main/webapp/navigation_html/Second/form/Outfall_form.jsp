<%@ page language="java" import="java.util.*,org.easybooks.bookstore.vo.*,org.easybooks.bookstore.dao.impl.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>排水口表单</title>     
    <link href="../../lib/ligerUI/skins/Aqua/css/ligerui-form.css" rel="stylesheet"
        type="text/css" />
    <script src="../../lib/jquery/jquery-1.9.0.min.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/core/base.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerForm.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerDateEditor.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerComboBox.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerCheckBox.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerButton.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerRadio.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerSpinner.js" type="text/javascript"></script>
    <script src="../../lib/ligerUI/js/plugins/ligerTextBox.js" type="text/javascript"></script>
    
     <SCRIPT> 
     <!-- 
       function bconfirm(){ 
          opener.document.all['inboxname'].value=document.form1.inboxname.value; 
          opener.opensub(); 
          window.close(); 
       } 
       
      function bcancel(){ 
          window.close(); 
       } 
     --> 
   </SCRIPT> 
          
    

    <script type="text/javascript">
        $(function ()
        {
            $("form").ligerForm();
        }); 
    </script>
    <style type="text/css">
           body{ font-size:12px;}
        .l-table-edit {}
        .l-table-edit-td{ padding:4px;}
        .l-button-submit,.l-button-reset{width:80px; float:left; margin-left:10px; padding-bottom:2px;}
        .l-verify-tip{ left:230px; top:120px;}
    </style>

</head>

<body style="padding:10px">

    <form name="outfall_form" action="Outfall_form.action"  method="post" id="outfall_form">
<div>
</div>

        <table cellpadding="0" cellspacing="0" bordercolor="#F0F0F0" class="l-table-edit" >
		<!--第一行-->
            <tr>
               
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">企业序号</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Ent_no" type="text" id="Ent_no" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排放口编号</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_name" type="text" id="Out_name" ltype="text" /></td>
            </tr>
			<!-- 第二行 -->
            
			
			<!-- 第三行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排放口发布名称</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_water_name" type="text" id="Out_water_name" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排放规律</td>
                <td width="408" align="left" class="l-table-edit-td">
				  <select name="Out_regular" id="Out_regular" ltype="select" >
	                      <option value="1">有规律间断排放</option>
	                      <option value="2">不规律间断排放</option>
	                      <option value="3">周期性连续排放</option>
	                      <option value="4">稳定连续排放</option>
	                      <option value="5">其他</option>
                 </select>				</td>
            </tr>  
			<!-- 第四行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排放去向</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_direction" type="text" id="Out_direction" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口位置</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_location" type="text" id="Out_location" ltype="text" /></td>
            </tr>  
			 <!-- 第五行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排放口类型</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_type" type="text" id="Out_type" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">标志牌安装形式</td>
                <td width="408" align="left" class="l-table-edit-td">
				 <select name="Out_form" id="Out_form" ltype="select" >
	                      <option value="1">立式</option>
	                      <option value="2">平面固定式</option>
	                      <option value="3">其他</option>
                 </select>				</td>
            </tr>  
			<!-- 第六行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">是否联网</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td">
			   <select name="Out_net" id="Out_net" ltype="select" >
	                      <option value="1">联网</option>
	                      <option value="2">未联网</option>
                 </select>			  </td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水数据上报</td>
                <td width="408" align="left" class="l-table-edit-td">
				 <select name="Out_data_report" id="Out_data_report" ltype="select" >
	                      <option value="1">已上报</option>
	                      <option value="2">未上报</option>
                 </select>				</td>
            </tr>  
            <!-- 第七行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口直流/支流</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_tributary" type="text" id="Out_tributary" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口水域功能区类别</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_waters_function" type="text" id="Out_waters_function" ltype="text" /></td>
            </tr>  
			 <!-- 第八行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口纬度（度）</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_latitude" type="text" id="Out_latitude" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口经度（度）</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_longitude" type="text" id="Out_longitude" ltype="text" /></td>
            </tr>  
			 <!-- 第九行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">采样排口类型</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_sampling_type" type="text" id="Out_sampling_type" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口流域</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_watershed" type="text" id="Out_watershed" ltype="text" /></td>
            </tr>  
			 <!-- 第十行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水上报编码</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_report_no" type="text" id="Out_report_no" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水上报MN</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_report_MN" type="text" id="Out_report_MN" ltype="text" /></td>
            </tr>  
			 <!-- 第十一行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口状态</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td">
			   <select name="Out_state" id="Out_state" ltype="select" >
	                      <option value="1">启用</option>
	                      <option value="2">停用</option>
                 </select>	
			  </td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口水系</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_water_system" type="text" id="Out_water_system" ltype="text" /></td>
            </tr>  
			 <!-- 第十二行 -->
            <tr>
               <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口断面</td>
              <td width="408" align="left" bordercolor="#3399FF" class="l-table-edit-td"><input name="Out_section" type="text" id="Out_section" ltype="text" /></td>
                <td width="100" align="right" bordercolor="#3399FF" class="l-table-edit-td">排水口功能区域</td>
                <td width="408" align="left" class="l-table-edit-td"><input name="Out_domain" type="text" id="Out_domain" ltype="text" /></td>
            </tr>  
			
			 <tr>
               <td colspan="2" align="right" bordercolor="#3399FF" class="l-table-edit-td"> 
                 <input type="submit" value="提交" id="Button1" class="l-button l-button-submit" /> 
               </td>
              <td colspan="2" align="left" bordercolor="#3399FF" class="l-table-edit-td">
                <input type="reset" value="重置" class="l-button l-button-reset"/>
              </td>
            </tr>  
      </table>
 <br />


    </form>
    <div style="display:none">
    <!--  数据统计代码 --></div> 
</body>
</html>
