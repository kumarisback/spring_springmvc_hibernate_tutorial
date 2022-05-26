<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>


<!-- here we are givin css file reference -->

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/customer.css"/>
</head>
<body>
<h1>List of all customer</h1>

<div id="wrapper">

					<div id="content">
						<table>
									<tr>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Email</th>
										<th>Action</th>
									</tr>
									<c:forEach var="temp" items="${customers}">
									
									
									<c:url var="updateLink" value="showFromForUpdate">
										<c:param  name="id"  value="${temp.id}"/>
										</c:url>
										
										<c:url var="deleteLink" value="delete">
										<c:param  name="id"  value="${temp.id}"/>
										</c:url>
										
										
									<tr>
									<td>${temp.firstName }</td>
									<td>${temp.lastName }</td>
									<td>${temp.email }</td>
									<td><a href="${updateLink}">update</a>||<a href="${deleteLink}"  onclick="if(!(confirm('are you sure want to delete this user?'))) return false  "   >Delete</a></td>
									</tr>
						
						</c:forEach>
						
						
						</table>
					</div>
					
					<button   onClick="window.location.href='showFormForAdd'; return false">add Customer</button>


</div>
</body>
</html>