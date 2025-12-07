package com.pit.card.controller;

import com.pit.card.dto.CardInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @Autowired
    CardInfoDto cardInfoDto;

    @GetMapping("/card")
    public String GetCardStatus() {
        return "Card Request Uploaded Succesfully";
    }

    @GetMapping("/card-info")
    public ResponseEntity<CardInfoDto> GetCardInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(cardInfoDto);
    }

}
