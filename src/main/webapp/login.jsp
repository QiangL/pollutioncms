<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>

    <title>登录</title>
    <link href="css/main.css" rel="stylesheet" type="text/css">

	<script language="javascript">
	<!--

	function mouseOver()
    {
	document.getElementById("LoginBtn").style.backgroundImage = "url(images/LoginOKed.png)"
    }
    function mouseOut(){
	document.getElementById("LoginBtn").style.backgroundImage = "url(images/LoginCa.PNG)"
     }
	 //-->
	</script>

</head>
<body>


<style type="text/css">
    html, body
    {
        width: 100%;
        height: 100%;
        overflow: hidden;
        background-color: White;
    }
    *
    {
        margin: 0px;
        padding: 0px;
        border: 0px;
    }
    body
    {
        text-align: center;
        font-size: 12px;
        line-height: normal;
        font-family: "宋体";
        font-weight: normal;
        padding: 0;
        margin: 0;
    }
    div
    {
        height: 100%;
    }
</style>
<div class="my_mid">


        <div style="height: 365px; position: absolute; top: 280px; left: 477px; width: 457px;
            clear: both; margin-top: 0px; margin-left: 0px;">

			<form action="/login" method="post">
            <table cellspacing="5" cellpadding="5" border="1" bordercolor="#00FF00">
                <tr>
                    <td align="right">
                        <div class="tdLoginUser" style="margin-top: 5px"></div>                    </td>
                    <td valign="top">
                        <input type="text" name="username"  class="TextBoxStyle" tabindex="1" />                    </td>
                    <td valign="top" rowspan="2">

					<input name="LoginBtn" type="submit" class="LoginBtn" id="LoginBtn" tabindex="3" onClick="btnLogin_Click()"  onmouseover="mouseOver()" onmouseout="mouseOut()" value="" />


					</td>
                </tr>
                <tr>
                    <td align="right">
                        <div class="tdLoginPwd" style="margin-top: 5px">                 </div>                    </td>
                    <td valign="top">
                        <input type="password" name="password"  class="TextBoxStyle" tabindex="2" />                    </td>
                </tr>
            </table>
			</form>
        </div>
</div>
<div class="my_left">
    <div class="container">    </div>
</div>
<div class="my_right">
    <div class="container">    </div>
</div>


</body>
</html>
