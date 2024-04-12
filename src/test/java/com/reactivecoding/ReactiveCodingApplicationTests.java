package com.reactivecoding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;

import java.time.Duration;
import java.util.Locale;

@SpringBootTest
class ReactiveCodingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void workingWithMono() throws InterruptedException {
//		Mono -> publisher that have 0-1 item
		// create mono
//
//		Mono<String> errorMono = Mono.error(new RuntimeException("Error...."));
//
//		Mono<String> m1 = Mono.just("Ranjit")
//				.log()
//				.then(errorMono);
//
//		// consume mono
////		m1.subscribe(data ->
////						System.out.println("data is : "+data)
////				);
//
////		by using method referance
//		m1.subscribe(System.out::println);

		// Example of Mono zip()

		Mono<String> m1 = Mono.just("Learn with Ranjit");
		Mono<String> m2 = Mono.just("Subscribe");
		Mono<Integer> m3 = Mono.just(54665);


		Mono<Tuple3<String, String, Integer>> zipMono = Mono.zip(m1, m2, m3);

//		zipMono.subscribe(data ->
//				{
//					System.out.println(data);
//					System.out.println(data.getT1());
//					System.out.println(data.getT2());
//					System.out.println(data.getT3());
//
//				}
//		);
//
//		Mono<Tuple2<String, String>> tuple2Mono = m1.zipWith(m2);
//
//		tuple2Mono.subscribe(data->{
//			System.out.println(data);
//			System.out.println(data.getT1());
//			System.out.println(data.getT2());
//		});

		// map

//		Mono<String> map1 = m1.map(item -> item.toUpperCase(Locale.ROOT));
//		map1.subscribe(System.out::println);
//
//		// flatMap
//
//		Mono<String[]> flatMap = m1.flatMap(item -> Mono.just(item.split(" ")));
//
//		flatMap.subscribe(data ->{
//			for (String s : data)
//				System.out.println(s);
//		});
//
//
//		// flatMapMany
//		System.out.println("______________________________");
//
//		Flux<String> stringFlux = m1.flatMapMany(data -> Flux.just(data.split(" ")));
//		stringFlux.subscribe(data ->
//						System.out.println(data)
//				);


		// concat
//		System.out.println("--------------------");
//		Flux<String> con1 = m1.concatWith(m2)
//				.log().delayElements(Duration.ofMillis(2000));
//
//		con1.subscribe(data ->{
//			System.out.println(Thread.currentThread().getName());
//			System.out.println(data);
//		});
//
//		Thread.sleep(5000);
//		con1.subscribe(System.out::println);
//		System.out.println("main End");

	//delayElement
		m1.delayElement(Duration.ofSeconds(2));
		m1.subscribe( data -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(data);

		});



	}


}
