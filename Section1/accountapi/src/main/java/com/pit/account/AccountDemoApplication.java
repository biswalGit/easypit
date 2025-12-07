package com.pit.account;

import com.pit.account.dto.AccountInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AccountInfoDto.class)
public class AccountDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountDemoApplication.class, args);
	}

}
