package ucu.edu.ua.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppConfig {
    @Bean
    public String getData(){
        return "hello, world!";
    }
}
