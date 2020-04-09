package com.hebei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: mapper
 * @since: 2020/4/8
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(WebApplicationType.NONE).run(args);
        SpringApplication.run(Application.class, args);
    }

}
