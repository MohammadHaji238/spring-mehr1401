
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<select >
    <c:forEach  var="product" items="${products}">
        <option id="${product.id}"><c:out value="${product.name}"/></option>
    </c:forEach>
</select>

</body>
</html>
