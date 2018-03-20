package mvcex2.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mvcex2.model.Address;
import mvcex2.model.UserDetails;

public class AddressService {

	
	
	EntityManager m;
	public AddressService (){
		
		 m= Persistence.createEntityManagerFactory("mvcex2persistence").createEntityManager();
		
	}
	
	
 public void saveUserAddress(Address a) {
	 EntityTransaction t=m.getTransaction();
	 t.begin();
	 m.persist(a);
	t.commit();
	m.close();
 }
	 
}
