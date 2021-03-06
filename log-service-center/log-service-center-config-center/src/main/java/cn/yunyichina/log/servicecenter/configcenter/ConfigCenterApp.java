package cn.yunyichina.log.servicecenter.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/22 12:07
 * @Description:
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigCenterApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApp.class, args);
    }

}
