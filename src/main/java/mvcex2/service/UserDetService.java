package mvcex2.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mvcex2.model.UserDetails;

public class UserDetService {
	
	EntityManager m;
	public UserDetService (){
		
		 m= Persistence.createEntityManagerFactory("mvcex2persistence").createEntityManager();
		
	}
	
	
 public void saveUser(UserDetails ud) {
	 EntityTransaction t=m.getTransaction();
	 t.begin();
	 m.persist(ud);
	t.commit();
	m.close();
	 
	 
	 
 
 }
 
 public UserDetails validate(String uname) {
	
	 UserDetails ud=m.find(UserDetails.class, uname);
	m.close();	 
	  return ud;
 }
}
