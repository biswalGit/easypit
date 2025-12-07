package com.pit.account.controller;

import com.pit.account.dto.AccountInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountInfoDto accountInfoDto;
    @GetMapping("/account")
    public String GetAccountStatus(){
        return "Account Created Succesfully";
    }

    @GetMapping("/account-info")
    public ResponseEntity<AccountInfoDto> GetAccountInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(accountInfoDto);
    }

}
