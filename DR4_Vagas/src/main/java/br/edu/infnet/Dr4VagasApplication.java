package br.edu.infnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class Dr4VagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dr4VagasApplication.class, args);
	}

}
