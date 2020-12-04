package org.hzero.oauth;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
@EnableChoerodonResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class ErochoauthApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(ErochoauthApplication.class, args);
        }

}