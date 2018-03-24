package mvcex2.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
@Entity
public class UserDetails extends ActionForm {

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	String name;
	Date  dob;
	
	@Id
	String username;
	@Override
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		
		ActionErrors ea= new ActionErrors();
		
		if(name.trim().equals(""))
		
		{
		 ea.add("name", new ActionMessage("Name"));
		 }
		
		if(username.trim().equals(""))
				{
			ea.add("username", new ActionMessage("UserName"));
				}
		return ea;
		
		
	}
}
