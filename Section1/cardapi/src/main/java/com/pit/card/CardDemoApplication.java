package com.pit.card;

import com.pit.card.dto.CardInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CardInfoDto.class)
public class CardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardDemoApplication.class, args);
	}

}
