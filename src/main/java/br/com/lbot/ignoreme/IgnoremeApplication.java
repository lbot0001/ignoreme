package br.com.lbot.ignoreme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class IgnoremeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgnoremeApplication.class, args);
	}

}
