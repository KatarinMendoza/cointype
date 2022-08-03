package com.sistemabancario.cointype.repository;

import com.sistemabancario.cointype.domain.CoinType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoinTypeRepository extends ReactiveCrudRepository<CoinType,String> {
}
