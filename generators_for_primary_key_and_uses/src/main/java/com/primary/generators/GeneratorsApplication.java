package com.primary.generators;

import com.primary.generators.repostory.ProductsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class GeneratorsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GeneratorsApplication.class, args);
		ProductsRepository repository = context.getBean(ProductsRepository.class);

//		Products product1 = new Products();
//		product1.setId(2);
//		product1.setName("copy");
//		product1.setPrice(123.0);
//		Products products = repository.save(product1);
//
		Optional<Products> pr = repository.findById(2);
		System.out.println("--------------"+ pr.get().toString());
		pr.get().setPrice(169.0);
		pr.get().setName("bookself help");
		repository.save(pr.get());



	}

}
