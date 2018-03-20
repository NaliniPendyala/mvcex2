package mvcex2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Address {
	
@Id	
@GeneratedValue (strategy=GenerationType.AUTO)
private int id;	
String doorno;
String street1;
String ct;
String st;
@OneToOne
UserDetails ud;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDoorno() {
	return doorno;
}
public void setDoorno(String doorno) {
	this.doorno = doorno;
}
public String getStreet1() {
	return street1;
}
public void setStreet1(String street1) {
	this.street1 = street1;
}
public String getCt() {
	return ct;
}
public void setCt(String ct) {
	this.ct = ct;
}
public String getSt() {
	return st;
}
public void setSt(String st) {
	this.st = st;
}
public UserDetails getUd() {
	return ud;
}
public void setUd(UserDetails ud) {
	this.ud = ud;
}

}
