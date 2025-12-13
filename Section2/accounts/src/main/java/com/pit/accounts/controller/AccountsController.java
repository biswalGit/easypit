package com.pit.accounts.controller;

import com.pit.accounts.dto.AccountsInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @Autowired
    AccountsInfoDto accountInfoDto;
    @GetMapping("/account")
    public String GetAccountStatus(){
        return "Account Created Succesfully";
    }

    @GetMapping("/account-info")
    public ResponseEntity<AccountsInfoDto> GetAccountInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(accountInfoDto);
    }

}
