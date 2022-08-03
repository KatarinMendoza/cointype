package com.sistemabancario.cointype.controller;

import com.sistemabancario.cointype.domain.CoinType;
import com.sistemabancario.cointype.service.ICoinTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cointype")
public class CoinTypeController {

    @Autowired
    private ICoinTypeService coinTypeService;

    @GetMapping
    public Flux<CoinType> findAll(){
        return coinTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<CoinType> getById(@PathVariable("id") String id){
        return coinTypeService.findById(id);
    }

    @PostMapping
    public Mono<CoinType> save(@RequestBody CoinType coinType){
        return coinTypeService.save(coinType);
    }

    @PutMapping
    public Mono<CoinType> update(@RequestBody CoinType coinType){
        return coinTypeService.update(coinType);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return coinTypeService.deleteById(id);
    }
}
