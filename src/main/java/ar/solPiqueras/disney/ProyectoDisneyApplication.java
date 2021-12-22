package ar.solPiqueras.disney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProyectoDisneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoDisneyApplication.class, args);
	}

}
