<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- the upper link is for\ looping through a variable -->
<html>



<body>

<h1> your First is ${student.firstName }</h1>

<h1> your Last is ${student.lastName }</h1>

<h1> your country  is ${student.country }</h1>
<h1> your fav Language  is ${student.favLanguage }</h1>

<h1> your operation system  is</h1>
<ul>
		<c:forEach var="temp" items="${student.os }" >
		
		<li>${temp}</li>
		
		</c:forEach>
		
</ul>

</body>

</html>