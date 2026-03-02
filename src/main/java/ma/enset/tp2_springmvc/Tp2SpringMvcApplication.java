package ma.enset.tp2_springmvc;

import ma.enset.tp2_springmvc.entities.Product;
import ma.enset.tp2_springmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication
public class Tp2SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp2SpringMvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(Product.builder()
					.name("Computer")
					.price(5400.0)
					.quantity(12.0)
					.build());
			productRepository.save(Product.builder()
					.name("Printer")
					.price(1200.0)
					.quantity(11.0)
					.build());
			productRepository.save(Product.builder()
					.name("Smart Phone")
					.price(12000.0)
					.quantity(33.0)
					.build());
			productRepository.findAll().forEach(p -> {
				System.out.println(p.toString());
			});
		};
	}

}
