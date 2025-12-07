package com.pit.loan;

import com.pit.loan.dto.LoanInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(LoanInfoDto.class)
public class LoanDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanDemoApplication.class, args);
	}

}
