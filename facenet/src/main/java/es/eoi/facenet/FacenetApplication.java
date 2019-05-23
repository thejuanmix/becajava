package es.eoi.facenet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "es.eoi.facenet.repositories")
@EntityScan( basePackages = {"es.eoi.facenet"} )
@ComponentScan(basePackages = "es.eoi.facenet")
@EnableAutoConfiguration
public class FacenetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacenetApplication.class, args);
	}


}
