package com.rentcloud.descovery.descoveryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaServer
public class DescoveryServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(DescoveryServiceApplication.class,args);

    }

}
