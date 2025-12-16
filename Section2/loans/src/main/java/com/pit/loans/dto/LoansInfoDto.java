package com.pit.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loan")
@Getter
@Setter
public class LoansInfoDto{
        String loanNo;
        String type;
        Map<String,String> loanInfo;
        List<String> onCallSupport;
}

