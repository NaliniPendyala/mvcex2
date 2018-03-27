
<%@page import="com.google.gson.Gson"%>
<%@page import="mvcex2.model.UserDetails"%>
<%@page import="mvcex2.service.UserDetService"%>
<%

UserDetService uds=new UserDetService();
UserDetails ud=uds.validate(request.getParameter("username"));



if(ud!=null)
{
	out.println(new Gson().toJson(ud));
}

%>
