package com.reactivecoding.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Locale;

@Service
public class FluxService {

    public Flux<String> simpleFlex(){
    return Flux.just("Ranjit","Sanjay","giri").log();
    }


    public Flux<String> fruitsFlux(){
        List<String> fruitsList = List.of("Mango","Bannana","Apple");
        return  Flux.fromIterable(fruitsList).log();

    }


    public Flux<Void> getEmpty(){
        return  Flux.empty();
    }

    public Flux<String> mapExampleFlux(){
        return simpleFlex().map( name -> name.toUpperCase());
    }


}
