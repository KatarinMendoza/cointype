package com.sistemabancario.cointype.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document("cointype")
public class CoinType {

    @Id
    private String id;
    private String name;
    private String abbreviation;
}
