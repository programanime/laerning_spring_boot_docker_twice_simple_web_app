package co.iacode.simpleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration 
public class SimplewebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimplewebApplication.class, args);
	}
}
