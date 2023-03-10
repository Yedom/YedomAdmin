package ru.mralexeimk.yedomadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class YedomAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(YedomAdminApplication.class, args);
    }
}
