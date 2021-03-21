package com.jzfq.seata.grade;

import com.jzfq.seata.grade.feign.config.DefaultFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@MapperScan("com.jzfq.seata.grade.mapper")
@EnableHystrix
@EnableFeignClients(basePackages = "com.jzfq.seata.grade.feign", defaultConfiguration = DefaultFeignConfig.class)
public class SeataGradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataGradeApplication.class,args);
    }

}
