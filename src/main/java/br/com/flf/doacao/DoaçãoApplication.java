package br.com.flf.doacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoaçãoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoaçãoApplication.class, args);
		System.out.println("Aplicação subiu...");
	}

}
