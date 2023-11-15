package com.ryo.elrys.configuration;

import com.ryo.elrys.elastic.Api;
import com.ryo.elrys.utils.Equipment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticConfiguration {

    @Bean
    public Api api(){return new Api();}

    @Bean
    public Equipment equipment(){return new Equipment();}

}
