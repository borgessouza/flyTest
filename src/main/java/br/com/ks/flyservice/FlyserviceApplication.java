package br.com.ks.flyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlyserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyserviceApplication.class, args);
    }

}
