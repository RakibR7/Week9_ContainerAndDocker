package atu.ie.week9_dockerandcontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week9DockerAndContainersApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week9DockerAndContainersApplication.class, args);
    }

}
