package com.pit.loans.controller;

import com.pit.loans.dto.LoansInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @Autowired
    LoansInfoDto loanInfoDto;
    @GetMapping("/loan")
    public String GetLoanStatus(){
        return "Loan Request Uploaded Succesfully";
    }
    @GetMapping("/loan-info")
    public ResponseEntity<LoansInfoDto> GetLoanInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(loanInfoDto);
    }
}
