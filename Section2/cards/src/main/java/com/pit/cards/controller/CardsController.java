package com.pit.cards.controller;

import com.pit.cards.dto.CardsInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @Autowired
    CardsInfoDto cardInfoDto;

    @GetMapping("/card")
    public String GetCardStatus() {
        return "Card Request Uploaded Succesfully";
    }

    @GetMapping("/card-info")
    public ResponseEntity<CardsInfoDto> GetCardInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(cardInfoDto);
    }

}
