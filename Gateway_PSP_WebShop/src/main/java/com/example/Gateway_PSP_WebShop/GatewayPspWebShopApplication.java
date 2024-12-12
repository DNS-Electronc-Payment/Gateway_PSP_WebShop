package com.example.Gateway_PSP_WebShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayPspWebShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayPspWebShopApplication.class, args);
	}

}
