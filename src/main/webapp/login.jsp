<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

<script>
function formaction(button)

{
	alert((document.forms[0].action)+"?method="+button.value);
	document.forms[0].action= document.forms[0].action+"?method="+button.value;
	document.forms[0].submit();
	
	}
</script>


<c:form action="registration">

<c:text property="username"></c:text>
<c:errors property="username"/>

<c:button value="login" property="click" onclick="formaction(this)"/>

</c:form>
</body>

</body>
</html>