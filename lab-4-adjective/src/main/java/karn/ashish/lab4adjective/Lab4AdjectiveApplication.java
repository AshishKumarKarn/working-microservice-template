package karn.ashish.lab4adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;//this also works fine but not recommended

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4AdjectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4AdjectiveApplication.class, args);
	}

}
