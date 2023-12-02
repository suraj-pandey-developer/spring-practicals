package com.security.jwt;

import com.security.jwt.entity.User;
import com.security.jwt.repository.UserRepository;
import com.security.jwt.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtApplication {
	@Autowired
	private UserRepository repo ;
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "Suraj", "password", "suraj@gmail.com"),
				new User(102, "din", "pasd", "no@gmail.com"),
				new User(103, "din1", "pasd1", "no@gmail.com"),
				new User(104, "din2", "pasd2", "no@gmail.com"),
				new User(105, "din3", "pasd3", "no@gmail.com")
		).collect(Collectors.toList());
		repo.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}
