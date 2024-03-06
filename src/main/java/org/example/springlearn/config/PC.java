package org.example.springlearn.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.example.springlearn.config.motherboard.Motherboard;
import org.example.springlearn.components.GPU;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class PC {
    @Bean
    public GPU createGpu() {
        return new GPU();
    }
    
    @Bean
    public Motherboard createMyConfigPC(@Qualifier("createGpu") GPU gpu) {
        return new Motherboard(gpu);
    }

    @PostConstruct
    public void postConstruct() {
        log.info("PC created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("PC destroyed");
    }
}
