<%-- 
    Document   : addTwoNum
    Created on : Jan 31, 2023, 8:41:54 AM
    Author     : thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String sn1,sn2,sn3;int n1,n2, n3, n4 , n5; %>
<%
   sn1 = request.getParameter("n1");
   sn2 = request.getParameter("n2");
   sn3 = request.getParameter("n3");
   if(sn1==null){
	n1=0;
   }else{
     n1 = Integer.parseInt(sn1);}
	   if(sn2==null){
	     n2=0;}
	     else{
	     n2 = Integer.parseInt(sn2);}
	     if(sn3==null){
	     n3=0;}
	     else{
	     n3 = Integer.parseInt(sn3);}
   
   n4 = n1 + n2;
   n5 = n2 + n3;
%>    
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
	<p1>ThinhNP</p1>
	<form action="#" method="post">
		<p>a:	
			<input type = "text" name = "n1" value = "<%= n1 %>"/>
		<p>b:	
			<input type = "text" name = "n2" value = "<%= n2 %>"/>
		<p>c:	
			<input type = "text" name = "n3" value = "<%= n3 %>"/>
		<p>a+b:
			<input type="text" name="n4" value="<%= n4 %>"/> 
		<p>b+c:
			<input type="text" name="n5" value="<%= n5 %>"/> 
		<p><input type="Submit" value = "DO">
	</form>
</body>
</html>
