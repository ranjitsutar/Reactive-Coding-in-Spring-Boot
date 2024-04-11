package com.reactivecoding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

@SpringBootTest
class ReactiveCodingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void workingWithMono(){
//		Mono -> publisher that have 0-1 item
		// create mono

		Mono<String> errorMono = Mono.error(new RuntimeException("Error...."));

		Mono<String> m1 = Mono.just("Ranjit")
				.log()
				.then(errorMono);

		// consume mono
//		m1.subscribe(data ->
//						System.out.println("data is : "+data)
//				);

//		by using method referance
		m1.subscribe(System.out::println);


	}


}
