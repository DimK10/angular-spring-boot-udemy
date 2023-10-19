package com.luv2code.ecommerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    private final String[] theAllowedOrigins;

    private final String basePath;

    public MyAppConfig(@Value("${allowed.origins}") String[] theAllowedOrigins, @Value("${spring.data.rest.base-path}") String basePath) {
        this.theAllowedOrigins = theAllowedOrigins;
        this.basePath = basePath;
    }

    @Override
    public void addCorsMappings(CorsRegistry cors) {
        // set up cors mapping
        cors.addMapping(basePath + "/**").allowedOrigins(theAllowedOrigins);
    }
}
