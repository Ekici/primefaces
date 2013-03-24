/**
 * 
 */
package com.sivalabs.pfdemo.basics;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.sivalabs.pfdemo.utils.JSFUtils;

/**
 * @author Siva
 *
 */
@ManagedBean
@RequestScoped
public class UserController 
{
	private User loginUser;
	private User registerUser;
	
	public UserController() {
		loginUser = new User();
		registerUser = new User();
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

	public String doLogin() 
	{
		if("admin".equals(loginUser.getUserName()) && "admin".equals(loginUser.getPassword()))
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
