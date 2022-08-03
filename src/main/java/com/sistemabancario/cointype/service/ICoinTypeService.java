package com.sistemabancario.cointype.service;

import com.sistemabancario.cointype.domain.CoinType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICoinTypeService {
    Flux<CoinType> findAll();
    Mono<CoinType> findById(String id);
    Mono<CoinType> save(CoinType coinType);
    Mono<CoinType> update(CoinType coinType);
    Mono<Void> deleteById(String id);
}
