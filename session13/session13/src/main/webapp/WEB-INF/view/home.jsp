<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/24/2023
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
home

<%
    String name =(String) request.getAttribute("name");
    out.print(name);
%>

<br>
${headers}
</body>
</html>
