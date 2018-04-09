package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.dao.IUserDAO;
import org.easybooks.bookstore.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LoginAction extends ActionSupport{
	private User user;
	public String execute() throws Exception{
		boolean validated = false;
		
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"file:D:/MyEclipse 10/Workspaces/MonitoredControl_test1/src/applicationContext.xml");
		
		System.out.println("LoginAction:username"+user.getUserName());
		
		IUserDAO userDAO = (IUserDAO)context.getBean("userDAO");
		User u = userDAO.validateUser(user.getUserName(),user.getUserPassword());
		if(u != null){
			validated = true;
		}
		if(validated){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user = user;
	}
	

}
