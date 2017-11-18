<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<c:forEach var="item" items="${list}">
 <c:out value="item.productName"/></br>
</c:forEach>

<%-- <p1>${list.productName} </p1> --%>

</body>
</html>
