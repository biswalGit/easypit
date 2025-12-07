package com.pit.loan.controller;

import com.pit.loan.dto.LoanInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @Autowired
    LoanInfoDto loanInfoDto;
    @GetMapping("/loan")
    public String GetLoanStatus(){
        return "Loan Request Uploaded Succesfully";
    }
    @GetMapping("/loan-info")
    public ResponseEntity<LoanInfoDto> GetLoanInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(loanInfoDto);
    }
}
