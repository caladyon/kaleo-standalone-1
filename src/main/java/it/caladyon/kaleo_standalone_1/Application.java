/**
 *
 */
package it.caladyon.kaleo_standalone_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import it.caladyon.kaleo_standalone_1.model.Asset;
import it.caladyon.kaleo_standalone_1.service.AssetService;

/**
 * @author IG08197
 *
 */
@SpringBootApplication
@ImportResource({
	// kaleo.runtime.api 2.0.0
	"classpath:META-INF/spring/kaleo-spring.xml"
	})
public class Application {

	private final Logger log = LoggerFactory.getLogger(getClass());


	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

//	@Bean
//	public CommandLineRunner runDemoRepositoryWithoutWorkflow(@Qualifier("noWF") final AssetRepository repository) {
//		return new CommandLineRunner() {
//
//			@Override
//			public void run(String... args) throws Exception {
//	            log.info("");
//				log.info("### Demo: Repository Without Workflow ### " + repository);
//	            log.info("");
//
//				// save a couple of customers
//				repository.save(new Asset("Jack", "Bauer"));
//				repository.save(new Asset("Chloe", "O'Brian"));
//				repository.save(new Asset("Kim", "Bauer"));
//				repository.save(new Asset("David", "Palmer"));
//				repository.save(new Asset("Michelle", "Dessler"));
//
//				// fetch all customers
//				log.info("Assets found with findAll():");
//				log.info("-------------------------------");
//				for (Asset customer : repository.findAll()) {
//					log.info(customer.toString());
//				}
//	            log.info("");
//
//				// fetch an individual customer by ID
//	            long l = 1L;
//	            Asset customer = repository.findOne(l);
//	            while (customer == null) {
//	            	l += 5;
//	            	customer = repository.findOne(l);
//	            }
//				log.info("Asset found with findOne(1L):");
//				log.info("--------------------------------");
//				log.info(customer.toString());
//	            log.info("");
//
//				// fetch customers by last name
//				log.info("Asset found with findByLastName('Bauer'):");
//				log.info("--------------------------------------------");
//				for (Asset bauer : repository.findByLastName("Bauer")) {
//					log.info(bauer.toString());
//				}
//	            log.info("");
//
//	            log.info("Delete all");
//	            repository.deleteAll();
//	            log.info("");
//			}
//		};
//	}

	@Bean
	public CommandLineRunner runDemoServiceWithoutWorkflow(@Qualifier("noWF") final AssetService service) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
	            log.info("");
				log.info("### Demo: Service Without Workflow ### " + service);
	            log.info("");

				// save a couple of customers
	            Asset c = service.create(new Asset("Jack", "Bauer"));
				service.create(new Asset("Chloe", "O'Brian"));
				service.create(new Asset("Kim", "Bauer"));
				service.create(new Asset("David", "Palmer"));
				service.create(new Asset("Michelle", "Dessler"));

				// fetch all customers
				log.info("Assets found with findAll():");
				log.info("-------------------------------");
				for (Asset customer : service.findAll()) {
					log.info(customer.toString());
				}
	            log.info("");

//				// fetch an individual customer by ID
//	            Asset c = service.getRepository().findOne(1L);
//				log.info("Asset found with findOne(1L):");
//				log.info("--------------------------------");
//				log.info(c.toString());
//	            log.info("");

	            service.delete(c);
				log.info("Asset deleted:");
				log.info("--------------------------------");
				log.info(c.toString());
	            log.info("");

				// fetch all customers
				log.info("Assets found with findAll():");
				log.info("-------------------------------");
				for (Asset customer : service.findAll()) {
					log.info(customer.toString());
				}
	            log.info("");

//	            log.info("Delete all");
//	            service.getRepository().deleteAll();
//	            log.info("");
			}
		};
	}

	@Bean
	public CommandLineRunner runDemoServiceWithWorkflow(@Qualifier("WF") final AssetService service) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
	            log.info("");
				log.info("### Demo: Service With Workflow ### " + service);
	            log.info("");

				// save a couple of customers
	            Asset c = service.create(new Asset("Jack", "Bauer"));
				service.create(new Asset("Chloe", "O'Brian"));
				service.create(new Asset("Kim", "Bauer"));
				service.create(new Asset("David", "Palmer"));
				service.create(new Asset("Michelle", "Dessler"));

				// fetch all customers
				log.info("Assets found with findAll():");
				log.info("-------------------------------");
				for (Asset customer : service.findAll()) {
					log.info(customer.toString());
				}
	            log.info("");

//				// fetch an individual customer by ID
//	            Asset c = service.getRepository().findOne(1L);
//				log.info("Asset found with findOne(1L):");
//				log.info("--------------------------------");
//				log.info(c.toString());
//	            log.info("");

	            service.delete(c);
				log.info("Asset deleted:");
				log.info("--------------------------------");
				log.info(c.toString());
	            log.info("");

				// fetch all customers
				log.info("Assets found with findAll():");
				log.info("-------------------------------");
				for (Asset customer : service.findAll()) {
					log.info(customer.toString());
				}
	            log.info("");

//	            log.info("Delete all");
//	            service.deleteAll();
//	            log.info("");
			}
		};
	}

}
