package com.custom.customGenerator;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(CustomGeneratorApplication.class, args);
//		Orders orders = context.getBean(Orders.class);

		Orders o1 = new Orders("suraj");
		Orders o2 = new Orders("suraj");
		Orders o3 = new Orders("suraj");

		OrderRepository repository = context.getBean(OrderRepository.class);
		repository.save(o1);
		context.close();
	}

}
