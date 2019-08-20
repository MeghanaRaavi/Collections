package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddUser {

	public static void main(String[] args)
	{
		
	User a =new User();
	User b=new User();
	User d=new User();
	
	a.setUsername("Sai");
	a.setPassword("Baba");
	b.setUsername("Naren");
	b.setPassword("Nimma12");
	d.setUsername("aron");
	d.setPassword("amma12");
	List <User> list=new ArrayList<User>();
	list.add(a);
	list.add(b);
	list.add(d);
	Collections.sort( list);
	
	for (User c: list)
	System.out.println(c.getUsername()+" "+c.getPassword());
	}
	
	
}
