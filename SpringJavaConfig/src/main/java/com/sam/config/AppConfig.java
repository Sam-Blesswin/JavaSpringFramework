package com.sam.config;

import com.sam.Coder;
import com.sam.Computer;
import com.sam.Desktop;
import com.sam.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //@Bean(name = "Beast")
    @Bean
    @Primary
    //@Scope("prototype") //be default its singleton
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    //@Scope("prototype") //be default its singleton
    public Laptop laptop(){
        return new Laptop();
    }

    @Bean
    public Coder coder (Computer computer) //(@Qualifier("laptop") Computer computer)
    {
        Coder coder =   new Coder();
        coder.setAge(24);
        coder.setComputer(computer);

        return coder;
    }
}
