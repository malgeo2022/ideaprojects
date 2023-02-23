package com.example.demo;

import com.example.demo.dao.UserDAO;
import com.example.demo.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserDAO userDAO = new UserDAO();

		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("George");
		user1.setLastName("Malelis");
		user1.setAge(18);

		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Stelios");
		user2.setLastName("Matthaios");
		user2.setAge(24);

		userDAO.save(user1);
		userDAO.save(user2);


		userDAO.findAll();
		System.out.println("User with id : " + userDAO.find(2));
		System.out.println("All users parsed in thw List : " + userDAO.findAll());





	}

}
