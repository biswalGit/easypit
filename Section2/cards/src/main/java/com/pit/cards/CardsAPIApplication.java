package com.pit.cards;

import com.pit.cards.dto.CardsInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CardsInfoDto.class)
public class CardsAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsAPIApplication.class, args);
    }

}
