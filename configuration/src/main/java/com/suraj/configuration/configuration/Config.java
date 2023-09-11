package com.suraj.configuration.configuration;

import org.springframework.stereotype.Component;

@Component
public class Config {
    public Config(){
        System.out.println("config :: constructor");
    }

    public void run(){
        System.out.println("run ::: method");
    }
}
