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
function validate(username)
{
	
	
    var http=new XMLHttpRequest();
   
    http.onreadystatechange=function()
    {
    	
    	if(this.readyState == 4 && this.status == 200)
    	{
    	   var user=JSON.parse(this.responseText);
    	   alert(user.name);
    	   document.getElementById("name").innerHTML=user.name;
    	   document.getElementById("username").innerHTML=user.username;
        	    
    	}
    }
    
   
    
    http.open("GET","validateemail.jsp?username="+username.value,true);
    http.send();
}
</script>


<c:form action="registration">

<c:text property="username" onblur="validate(this)"/>
<span id="validationmessage"></span>
<c:errors property="username"/>

<c:button value="login" property="click" onclick="formsubmit()"/>

</c:form>

<table>
<tr>
<td id='name'></td><td id="username"></td>
</tr>

</table>

</body>

</body>
</html>