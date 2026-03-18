package br.com.gleidson.main.primeirospringbootaplcation;

import br.com.gleidson.main.controller.PrimeiraController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "br.com.gleidson.main")
//@ComponentScan(basePackageClasses = PrimeiraController.class)
public class PrimeiroSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroSpringbootApplication.class, args);
	}

}
  