package com.custom.query;

import com.custom.query.model.User;
import com.custom.query.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class QueryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(QueryApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		Iterable<User> users = repository.findAll();
		users.forEach(user -> {
			System.out.println(user.getName());
		});
		System.out.println("########################################");
		List<User> users1 = repository.getAllUserHql();
		users1.forEach(user -> {
			System.out.println("values   :::  "+user);
		});

		System.out.println("########################################");
		List<User> users2 = repository.getAllUserSql();
		users2.forEach(user -> {
			System.out.println("values :::  "+user);
		});

		System.out.println("########################################");
		List<User> users3 = repository.getAllUserByCountry("India");
		users3.forEach(user -> {
			System.out.println("values By Country :::  "+user);
		});
		System.out.println("######################################## values By Country using sql query ");
		List<User> users4 = repository.getAllUserByCountryUsingSql("India");
		users4.forEach(user -> {
			System.out.println("sql query:::  "+user);
		});

	}

}
