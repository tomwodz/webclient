package pl.jjr.tomwodz.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.WeakHashMap;

@Configuration
public class Config {

    @Bean
    public WebClient webClient(){
        return WebClient
                .builder()
                .build();
    }

}
