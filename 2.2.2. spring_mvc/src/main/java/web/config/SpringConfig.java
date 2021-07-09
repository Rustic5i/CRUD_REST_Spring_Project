package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import web.dao.Cat;

@Configuration
public class SpringConfig {
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
