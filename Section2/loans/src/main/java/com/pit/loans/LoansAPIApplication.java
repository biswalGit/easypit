package com.pit.loans;

import com.pit.loans.dto.LoansInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(LoansInfoDto.class)
public class LoansAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansAPIApplication.class, args);
	}

}
