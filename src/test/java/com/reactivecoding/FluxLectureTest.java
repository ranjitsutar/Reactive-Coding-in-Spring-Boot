package com.reactivecoding;


import com.reactivecoding.services.FluxService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
public class FluxLectureTest {

    @Autowired
   private FluxService fluxService;

    @Test
    void simpleFluxText(){
//        fluxService.simpleFlex().subscribe(data ->
//        {
//            System.out.println(data);
//            System.out.println("done with flux data");
//        });



            // fruits

        fluxService.fruitsFlux().subscribe(
                System.out::println
        );

        System.out.println("---------------------");

        fluxService.getEmpty().subscribe(
                System.out::println
        );

        System.out.println("---------Map------------");


    }

    @Test
    public  void  mapTest(){
//        fluxService.mapExampleFlux().subscribe(data ->{
//            System.out.println(data);
//        });

        // How to validate

        Flux<String> capFlux = fluxService.mapExampleFlux();
        StepVerifier.create(capFlux)
                .expectNext("RANJIT", "SANJAY", "GIRI").verifyComplete();
    }


}
