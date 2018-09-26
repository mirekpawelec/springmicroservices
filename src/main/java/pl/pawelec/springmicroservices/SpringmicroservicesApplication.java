package pl.pawelec.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmicroservicesApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringmicroservicesApplication.class, args);
    }
}
