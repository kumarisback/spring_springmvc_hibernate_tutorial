<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>

<body>
<h1>student registration form</h1>
<form:form action="processregistraion" modelAttribute="student" method="POST">

First name: <form:input   path="firstName" />

<br>
Last name: <form:input   path="LastName" />

<br>

<form:select path ="country">
<!--  

HARD CODEED
	<form:option value="India" label="india"/>
	<form:option value="canda" label="canda"/>
	<form:option value="tim" label="tim"/>
	<form:option value="srk" label="srk"/>
	-->
	
	<form:options  items="${student.countryOptions}" />
	
	//generate option through java LinkedHashMap 
</form:select>

<br>
java<form:radiobutton path="favLanguage" value="java"/>
c++<form:radiobutton path="favLanguage" value="c++"/>
c<form:radiobutton path="favLanguage" value="c"/>
python<form:radiobutton path="favLanguage" value="python"/>
<br>

window<form:checkbox path="os" value="window"/>
kali<form:checkbox path="os" value="kali"/>
ubuntu<form:checkbox path="os" value="ubuntu"/>
macos<form:checkbox path="os" value="macos"/>
<br>
<input type=submit value="Submit"/>
</form:form>
</body>

</html>