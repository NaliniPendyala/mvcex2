package mvcex2.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserDetails {

	
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
	
}
