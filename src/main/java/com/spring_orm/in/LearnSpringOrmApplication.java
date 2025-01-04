package com.spring_orm.in;

import com.spring_orm.in.entity.User;
import com.spring_orm.in.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	private Logger logger = LoggerFactory.getLogger(LearnSpringOrmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//1. create user
//		User user = new User();
//		user.setName("Rahul Devligri");
//		user.setCity("Tonk");
//		user.setAge(25);
//		user.setEmail("rahuldevligri@gmail.com");
//		User savedUser = userService.saveUser(user);
//		System.out.println(savedUser);

		//2. get single user
//		List<User> users = userService.getAllUsers();
//		logger.info("User size: {}", users.size());
//		logger.info("Users: {}", users);

		//3. getUser by id
//		User user = userService.getUser(20);
//		logger.info("user is {}: ", user);

		//4. update user by Id
//		User oldUser = new User();
//		oldUser.setName("Rohit Veer");
//		oldUser.setCity("Hyderabad");
//		oldUser.setAge(24);
//		oldUser.setEmail("rohitveer@gmail.com");
//		User updatedUser = userService.updateUser(oldUser, 1);
//		logger.info("updated user details: {}", updatedUser);

		//5. delete single user
		userService.deleteUser(1);
	}
}
