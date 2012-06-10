package org.huamuzhen.core;

import java.util.List;

import org.huamuzhen.dal.dao.UserDAO;
import org.huamuzhen.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class CoreTest {
		
	private static final ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("app-context.xml");
	
	
	@Test
	public void testData(){
		
		UserDAO userDao = CONTEXT.getBean(UserDAO.class);
		
		

		User newUser = new User();
		newUser.setPassword("newPassword");
		newUser.setUsername("newUsername");
		
		userDao.saveAndFlush(newUser);		
		
		List<User> users = userDao.findAll();
		for(User user: users){
			System.out.println(user.getId());
			System.out.println(user.getUsername());
		}
	}

}
