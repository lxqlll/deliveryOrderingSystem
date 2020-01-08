package com.lxqlll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @remakr Eureka服务治理启动类
 * @createTime 2020年1月3日11点15分
 * @author lxqlll
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer //配置为服务治理类
public class EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class,args);
    }
}
