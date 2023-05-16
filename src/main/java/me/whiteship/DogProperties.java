package me.whiteship;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dog")
public class DogProperties {

    /** @ConfigurationProperties(prefix = "dog")
     *  @Bean 중에 "dog"라고 불릴 빈은 properties에서 관리하겠다!
     *  DogConfiguration 에 @EnableConfigurationProperties(DogProperties.class) 추가
     *  dependency 추가해야한다.
     *
     */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
