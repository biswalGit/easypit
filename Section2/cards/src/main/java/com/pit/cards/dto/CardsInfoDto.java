package com.pit.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
@ConfigurationProperties(prefix = "card")
public record CardsInfoDto(String cardNo, String type, Map<String,String> cardInfo, List<String> onCallSupport) {
}
