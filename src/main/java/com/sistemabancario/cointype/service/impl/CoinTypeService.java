package com.sistemabancario.cointype.service.impl;

import com.sistemabancario.cointype.domain.CoinType;
import com.sistemabancario.cointype.repository.ICoinTypeRepository;
import com.sistemabancario.cointype.service.ICoinTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CoinTypeService implements ICoinTypeService {

    @Autowired
    private ICoinTypeRepository coinTypeRepository;
    @Override
    public Flux<CoinType> findAll() {
        return coinTypeRepository.findAll();
    }

    @Override
    public Mono<CoinType> findById(String id) {
        return coinTypeRepository.findById(id);
    }

    @Override
    public Mono<CoinType> save(CoinType coinType) {
        return coinTypeRepository.save(coinType);
    }

    @Override
    public Mono<CoinType> update(CoinType coinType) {
        return coinTypeRepository.save(coinType);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return coinTypeRepository.deleteById(id);
    }
}
