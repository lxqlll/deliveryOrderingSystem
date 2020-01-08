package com.lxqlll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @remakr config server 配置服务
 * @createTime 2020年1月3日13点38分
 * @author lxqlll
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer  //配置为配置服务
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
