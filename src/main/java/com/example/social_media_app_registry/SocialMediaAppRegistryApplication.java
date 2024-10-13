package com.example.social_media_app_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
// http://localhost:8761/registry
public class SocialMediaAppRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SocialMediaAppRegistryApplication.class, args);
	}
}
