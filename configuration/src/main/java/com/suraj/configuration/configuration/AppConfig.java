package com.suraj.configuration.configuration;

import com.suraj.configuration.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig :: construtor");
    }
    // this bean will create a bean type for predefined logic for creation of object
    @Bean
    public FileService createObjectUsing(){
        System.out.println("UserConfig :: constructor using bean");
        FileService f = new FileService();
        return f ;
    }
}
