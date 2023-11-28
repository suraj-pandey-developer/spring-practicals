package searching.and.filtering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import searching.and.filtering.model.User;
import searching.and.filtering.repository.UserRepostory;

@SpringBootApplication
public class FilteringApplication {

	public static void main(String[] args) {
		 SpringApplication.run(FilteringApplication.class, args);
	}

}
