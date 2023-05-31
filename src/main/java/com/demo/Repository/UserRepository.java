package com.demo.Repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.User;

@Repository
public class UserRepository {

	@Autowired 
	private HibernateTemplate ht;
	
	@Transactional
	public int adduser(User user)
	{
		int a=(Integer) ht.save(user);
		System.out.println("repo");
		return a;
	}
	
	@Transactional
	public List<User> listOfUser()
	{
		
		Query q=ht.getSessionFactory().getCurrentSession().createNativeQuery("select * from user where name='t'");
		System.out.println(" **************************************"+q.list());
	List<User> uv=	q.list();
		for(User u: uv)
		{
			System.out.println(u);
		}
		DetachedCriteria dc=DetachedCriteria.forClass(User.class);
		List<User> text=(List<User>) ht.findByCriteria(dc, 0, 2);
         return text;
		//return ht.loadAll(User.class);
	}
	
}
