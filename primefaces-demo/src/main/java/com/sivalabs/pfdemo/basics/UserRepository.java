/**
 * 
 */
package com.sivalabs.pfdemo.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Siva
 *
 */
public class UserRepository 
{
	public static List<User> findAll()
	{
		return UserTable.findAll();
	}
	public static User findById(Integer userId)
	{
		return UserTable.findById(userId);
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
		
		TABLE.put(u1.getUserId(), u1);
		TABLE.put(u2.getUserId(), u2);
		TABLE.put(u3.getUserId(), u3);
		TABLE.put(u4.getUserId(), u4);
		TABLE.put(u5.getUserId(), u5);
		
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
		TABLE.put(user.getUserId(), user);
	}
	
	public static void deleteUser(Integer userId)
	{
		TABLE.remove(userId);
	}
}
