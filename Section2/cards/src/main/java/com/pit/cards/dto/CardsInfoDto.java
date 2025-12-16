package com.pit.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
@ConfigurationProperties(prefix = "card")
@Getter
@Setter
public class CardsInfoDto{
        String cardNo;
        String type;
        Map<String,String> cardInfo;
        List<String> onCallSupport ;
}
