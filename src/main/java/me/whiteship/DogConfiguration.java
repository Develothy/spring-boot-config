package me.whiteship;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DogProperties.class)
public class DogConfiguration {

    @Bean
    @ConditionalOnMissingBean // 해당 타입의 bean이 없을 때만 config. 스프링 부트 버전이 올라가면서 현재는 빈 재정의 허용 X
    public Dog dog(DogProperties properties) {
        Dog dog = new Dog();
        dog.setName(properties.getName());
        dog.setAge(properties.getAge());
        // dog.setName("manzoo");
        // dog.setAge(5);
        return dog;
    }
}
