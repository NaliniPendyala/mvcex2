package mvcex2.test;

import java.util.Date;

import mvcex2.model.Address;
import mvcex2.model.UserDetails;
import mvcex2.service.AddressService;
import mvcex2.service.UserDetService;

public class test {

	public static void main(String[] args) {

		UserDetails ud= new UserDetails();
ud.setDob(new Date());
ud.setName("nalini");
ud.setUsername("n2");
Address a= new Address();
a.setDoorno("105-45");
a.setSt("abc");
a.setCt("hyd");
a.setStreet1("stret");
a.setUd(ud);
UserDetService uds= new UserDetService();
uds.saveUser(ud);

AddressService ads= new AddressService();
ads.saveUserAddress(a);


	

}

}
