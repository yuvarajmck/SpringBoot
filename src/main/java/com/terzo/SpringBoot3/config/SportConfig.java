package com.terzo.SpringBoot3.config;

import com.terzo.SpringBoot3.common.Coach;
import com.terzo.SpringBoot3.common.SwinCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwinCoach();
    }
}
