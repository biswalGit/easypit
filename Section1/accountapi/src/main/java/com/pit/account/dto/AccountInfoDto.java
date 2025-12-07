package com.pit.account.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "account")
public record AccountInfoDto(String accountNo, String type, Map<String,String> accountInfo, List<String> onCallSupport) {
}

