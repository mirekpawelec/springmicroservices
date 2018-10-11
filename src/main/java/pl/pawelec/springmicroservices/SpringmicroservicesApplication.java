package pl.pawelec.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringmicroservicesApplication {
    public static void main(String[] args) {
//        ApplicationContext context =
        SpringApplication.run(SpringmicroservicesApplication.class, args);
//        Arrays.stream(context.getBeanDefinitionNames()).sorted().forEach(
////                value -> System.out.println(value)
////        );
    }
}
