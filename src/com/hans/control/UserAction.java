package com.hans.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hans.model.User;
import com.hans.service.UserService;

public class UserAction {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");

		UserService service = (UserService) ctx.getBean("userService");
		User user = new User();
		user.setUsername("���ջ���");
		user.setPassword("ûѧ��");
		service.save(user);

		ctx.destroy();
	}
}
