package com.pit.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "account")
@Getter
@Setter
public class AccountsInfoDto{
    String accountNo;
    String type;
    Map<String,String> accountInfo;
    List<String> onCallSupport;
}

