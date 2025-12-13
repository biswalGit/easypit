package com.pit.accounts;

import com.pit.accounts.dto.AccountsInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AccountsInfoDto.class)
public class AccountsAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsAPIApplication.class, args);
	}

}
