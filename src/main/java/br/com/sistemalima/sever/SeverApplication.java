package br.com.sistemalima.sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeverApplication.class, args);
	}

}
