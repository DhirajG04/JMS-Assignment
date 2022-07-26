package com.cg.mc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.cg.mc.client.FirstFeignClient;
import com.cg.mc.client.SecondFeignClient;


@EnableFeignClients(basePackages = "com.cg.mc.client")
@RestController
public class Consuming12ServiceController {
		
	//# 1. using rest template
//		@Autowired
//		RestTemplate restTemplate;
		
	
	//# 2. using feign client
//	
//		@Autowired
//		FirstFeignClient firstFeign;
//		
//		@Autowired
//		SecondFeignClient secondFeign;
//		
		
		//# 3. using web client	
		@Autowired
		WebClient.Builder builder;

		@GetMapping("/consume")
		public String getMessage() {
			
		//# 1. using rest template
			
//			String first=restTemplate.getForObject("http://localhost:9001/first", String.class);
//			String second=restTemplate.getForObject("http://localhost:9002/second", String.class);
			
			
			
		//# 2. using feign client
		
//			String first=firstFeign.getFirstMessage();
//			String second=secondFeign.getSecondMessage();
			
			
		//# 3. using web client	
			
			
			String first=builder.build()
					.get()
					.uri("http://localhost:9001/first")
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
			String second=builder.build()
					.get()
					.uri("http://localhost:9002/second")
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
			return first+second;
		}

	
	
}
