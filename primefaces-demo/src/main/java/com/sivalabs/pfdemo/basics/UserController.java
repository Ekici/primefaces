/**
 * 
 */
package com.sivalabs.pfdemo.basics;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sivalabs.pfdemo.entities.User;
import com.sivalabs.pfdemo.utils.JSFUtils;

/**
 * @author Siva
 *
 */
//@ManagedBean
//@RequestScoped
@Component("userController")
@Scope("request")
public class UserController 
{
	@Autowired
	private UserRepository userRepository;
	
	private User loginUser;
	private User registerUser;
	private List<User> userList;
	
	public UserController() {
		loginUser = new User();
		registerUser = new User();
	}
	
	@PostConstruct
	public void init() {
		this.userList = userRepository.findAll();
	}
	
	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}

	public User getRegisterUser() {
		return registerUser;
	}

	public void setRegisterUser(User registerUser) {
		this.registerUser = registerUser;
	}
	
	public List<User> getUserList() {
		return userList;
	}
	
	public String doLogin() 
	{
		User user = userRepository.login(loginUser.getUserName(), loginUser.getPassword());
		if(user != null)
		{
			return "home.jsf?faces-redirect=true";
		}
		JSFUtils.addErrorMsg("Invalid UserName and Password. Please try again");
		return null;
	}
	
	public String doRegister() 
	{
		
		return "";
	}
}
