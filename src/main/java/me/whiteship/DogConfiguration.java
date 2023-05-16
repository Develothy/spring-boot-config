package me.whiteship;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfiguration {

    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("manzoo");
        dog.setAge(5);
        return dog;
    }
}
