package org.hzero.swagger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
@EnableChoerodonResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class ErochswaggerApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(ErochswaggerApplication.class, args);
        }

}