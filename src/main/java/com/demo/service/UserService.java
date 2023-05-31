package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.UserRepository;
import com.demo.model.User;

@Service
public class UserService {

	
	@Autowired 
	private UserRepository urepo;
	
public long accnumbergenerate()
{
	long min = 1111111111111111l;  
	long max = 9999999999999999l;  
	//Generate random double value from 200 to 400   
	System.out.println("Random value of type double between "+min+" to "+max+ ":");  
	long a = (long) (Math.random()*(max-min+1)+min);   
	System.out.println(a);  
	return a;

}
	
	public User useradd(User user)
	{
		System.out.println("service add");
		
		user.setAcnumber(accnumbergenerate());
		urepo.adduser(user);
		return user;

	}
	public List<User> getAll()
	{
		return urepo.listOfUser();
	}
}
