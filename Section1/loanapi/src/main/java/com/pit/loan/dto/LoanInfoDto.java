package com.pit.loan.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loan")
public record LoanInfoDto(String loanNo, String type, Map<String,String> loanInfo, List<String> onCallSupport) {
}

