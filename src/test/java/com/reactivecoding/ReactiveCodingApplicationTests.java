package com.reactivecoding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;

@SpringBootTest
class ReactiveCodingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void workingWithMono(){
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

		zipMono.subscribe(data ->
				{
					System.out.println(data);
					System.out.println(data.getT1());
					System.out.println(data.getT2());
					System.out.println(data.getT3());

				}
		);

		Mono<Tuple2<String, String>> tuple2Mono = m1.zipWith(m2);

		tuple2Mono.subscribe(data->{
			System.out.println(data);
			System.out.println(data.getT1());
			System.out.println(data.getT2());
		});
	}


}
