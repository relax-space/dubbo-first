package org.example.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: 肖新苗
 * @since: 2020/5/21
 * create at : 2020/5/21 4:14
 */
@EnableDubbo
@SpringBootApplication
public class HelloDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboProviderApplication.class, args);
    }

}