package com.ayatventure.ayatventure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        /*
        TODO: review cors filter before deploy to production
         corsConfiguration.addAllowedOrigin("https://trusted-domain.com");
         corsConfiguration.setAllowCredentials(true);
         corsConfiguration.addAllowedHeader("Content-Type");
        TODO: check which method my front send to configure here
         corsConfiguration.addAllowedMethod("GET");
         corsConfiguration.addAllowedMethod("POST");
        */

        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
