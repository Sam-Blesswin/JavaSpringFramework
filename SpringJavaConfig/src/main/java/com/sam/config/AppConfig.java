package com.sam.config;

import com.sam.Coder;
import com.sam.Computer;
import com.sam.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //@Bean(name = "Beast")
    @Bean
    //@Scope("prototype") //be default its singleton
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Coder coder(Computer computer){
        Coder coder =   new Coder();
        coder.setAge(24);
        coder.setComputer(computer);

        return coder;
    }
}
