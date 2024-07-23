package com.akshat;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean
    public Person person(@Qualifier("desktop") Computer com){     // Autowiring
        Person per = new Person();
        per.setAge(21);
        //When there is multiple bean of type com,there is conflict
        //So we can use @Qualifier("") or @Primary
        //Qualifier have higher priority
        per.setCom(com);
        return per;
    }



//    @Bean(name = "com2")
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }



    @Bean
//    @Primary

    public Laptop laptop(){
        return new Laptop();
    }

}
