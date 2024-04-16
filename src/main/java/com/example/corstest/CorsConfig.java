package com.example.corstest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc // this is for global cors allows origins are like https://.netlify.app
@Configuration

public class CorsConfig{

    @Bean
    public WebMvcConfigurer corsConfigurer(){

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/**")// enable CORS for the whole application
                        .allowedOrigins("http://localhost:3000","http://localhost:3000","https://cors-test-frontend.vercel.app/","https://cors-test-frontend.netlify.app/")// allows all cross origins request this can pass the pre-flight mechanism
                        .allowedMethods("GET","POST","PUT","PATCH","DELETE","OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true)
                        .maxAge(3600);
            }
        };
    }
}
