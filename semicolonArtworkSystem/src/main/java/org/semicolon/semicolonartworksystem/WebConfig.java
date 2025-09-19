package org.semicolon.semicolonartworksystem;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // apply to all routes
                .allowedOrigins("http://127.0.0.1:5500") // allow frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // allow these HTTP verbs
    }
}

