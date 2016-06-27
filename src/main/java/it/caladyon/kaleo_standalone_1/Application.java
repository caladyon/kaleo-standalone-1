/**
 *
 */
package it.caladyon.kaleo_standalone_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.caladyon.kaleo_standalone_1.model.Asset;
import it.caladyon.kaleo_standalone_1.repository.AssetRepository;

/**
 * @author IG08197
 *
 */
@SpringBootApplication
public class Application {

	private final Logger log = LoggerFactory.getLogger(getClass());


	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(final AssetRepository repository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// save a couple of customers
				repository.save(new Asset("Jack", "Bauer"));
				repository.save(new Asset("Chloe", "O'Brian"));
				repository.save(new Asset("Kim", "Bauer"));
				repository.save(new Asset("David", "Palmer"));
				repository.save(new Asset("Michelle", "Dessler"));

				// fetch all customers
				log.info("Customers found with findAll():");
				log.info("-------------------------------");
				for (Asset customer : repository.findAll()) {
					log.info(customer.toString());
				}
	            log.info("");

				// fetch an individual customer by ID
	            Asset customer = repository.findOne(1L);
				log.info("Customer found with findOne(1L):");
				log.info("--------------------------------");
				log.info(customer.toString());
	            log.info("");

				// fetch customers by last name
				log.info("Customer found with findByLastName('Bauer'):");
				log.info("--------------------------------------------");
				for (Asset bauer : repository.findByLastName("Bauer")) {
					log.info(bauer.toString());
				}
	            log.info("");
			}
		};
	}

}
