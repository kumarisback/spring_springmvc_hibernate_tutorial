<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Customer</h1>

<!-- here just add function name not path  -->
<form:form action="saveCustomer" modelAttribute="customer" method="POST">

<form:hidden path="id"/>
<table>
<tr>
<td>first name: </td>
<td><form:input path="firstName"/></td>
<tr>
<td>last name:</td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td>Email:</td>
<td><form:input path="email"/></td>
</tr>
</table>
<input type="submit"/>
</form:form>
<a href="${pageContext.request.contextPath}/customer/list">Back to home</a>
</body>
</html>