<%-- 
    Document   : home
    Created on : Jan 29, 2023, 8:49:14 AM
    Author     : thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.Date, java.text.SimpleDateFormat, java.lang.Math, java.text.DecimalFormat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Demo</title>
    </head>
    <body>
        <h2 style="color: chocolate">
            <%
            //code java
            String name = "To An An";
            out.println("Xin chao " + name);
            Date d = new Date();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            out.println("Hom nay la: " + f.format(d));
            double r = 1;
            double s = Math.PI * r * r;
            DecimalFormat df = new DecimalFormat("##.##");
            %>
        </h2>
        <h3>
            Dien tich: <%= df.format(s)%>
        </h3>
        <h1>Hello World!</h1>
    </body>
</html>
