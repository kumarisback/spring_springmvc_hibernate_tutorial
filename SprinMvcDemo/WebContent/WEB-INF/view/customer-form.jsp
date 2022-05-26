<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<style>

.error{color:red}
</style>
</head>

<body>

<h1>customer form</h1>

<!-- here just add function name not path  -->
<form:form action="processcustomerform" modelAttribute="customer">
first name: 
<form:input path="firstName"/>
<br>
last name:
<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />
<br>

your age:
<form:input path="age"/>
<form:errors path="age" cssClass="error" />
<BR>
your PASSWORD:
<form:input path="passWord"/>
<form:errors path="passWord" cssClass="error" />

<br>
<BR>
your PASSWORD:
<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error" />
<br>

<input type="submit"/>
</form:form>

</body>

</html>