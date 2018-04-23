<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<title>用AJAX以JSON方式提交数据</title> 
<script type="text/javascript" src="../comm/jquery/jquery.min.js"></script> 
</head> 
<body> 
    <form > 
       id：<input type="text" id="id" value="123" /><br/> 
       名称：<input type="text" id="name" value="category xxx"/><br/> 
        <input type="button" value="提交" id="sender">  
    </form> 
    <div id="messageDiv"></div> 
        
    <script> 
    $('#sender').click(function(){ 
        var id=document.getElementById('id').value; 
        var name=document.getElementById('name').value; 
        var category={"name":name,"id":id}; 
        var jsonData = JSON.stringify(category);
        var page="<%=path%>/hello5"; 
        $.ajax({
                type:"post",
               url: "<%=path%>/hello5",
               data:jsonData,
               dataType:"json",
               contentType : "application/json;charset=UTF-8",
               success: function(result){
            	   alert(result);
               }
            });
           //alert("æäº¤æåï¼è¯·å¨Tomcatæ§å¶å°æ¥çæå¡ç«¯æ¥æ¶å°çæ°æ®");
 
    });
    </script> 
</body> 
    
</html>