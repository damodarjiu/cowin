package com.cowin.vaccination;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Covid Vaccination Portal", version = "2.0", description = "A third party application for cowin. "))
public class VaccinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationApplication.class, args);
	}

}
