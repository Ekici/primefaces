/**
 * 
 */
package com.sivalabs.pfdemo.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.pfdemo.entities.User;

/**
 * @author Siva
 *
 */
@Repository
@Transactional
public class UserRepository 
{
	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAll()
	{
		return em.createQuery("from User", User.class).getResultList();
	}
	public User findById(Integer userId)
	{
		 TypedQuery<User> query = em.createQuery("from User where id=?1", User.class);
		 query.setParameter(1, userId);
		 List<User> resultList = query.getResultList();
		 if(!resultList.isEmpty())
			 return resultList.get(0);
		 return null;
	}
	
	public User login(String userName, String pwd)
	{
		 TypedQuery<User> query = em.createQuery("from User where userName=?1 and password=?2", User.class);
		 query.setParameter(1, userName);
		 query.setParameter(2, pwd);
		 
		 List<User> resultList = query.getResultList();
		 if(!resultList.isEmpty())
			 return resultList.get(0);
		 return null;
	}	
}

class UserTable
{
	private static Map<Integer, User> TABLE = new HashMap<Integer, User>();
	
	static
	{
		User u1 = new User(1, "admin", "admin", "Administrator");
		User u2 = new User(2, "test", "Test", "Test User");
		User u3 = new User(3, "siva", "siva", "Siva Prasad");
		User u4 = new User(4, "ram", "ram", "Ramu");
		User u5 = new User(5, "raj", "raj", "Raju");
		
		TABLE.put(u1.getId(), u1);
		TABLE.put(u2.getId(), u2);
		TABLE.put(u3.getId(), u3);
		TABLE.put(u4.getId(), u4);
		TABLE.put(u5.getId(), u5);
		
	}
	public static List<User> findAll()
	{
		return new ArrayList<User>(TABLE.values());
	}
	
	public static User findById(Integer userId)
	{
		return TABLE.get(userId);
	}
	
	public static void saveUser(User user)
	{
		TABLE.put(user.getId(), user);
	}
	
	public static void deleteUser(Integer userId)
	{
		TABLE.remove(userId);
	}
}
