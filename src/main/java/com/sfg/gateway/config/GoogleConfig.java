package com.sfg.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("google")
@Configuration
public class GoogleConfig {

    /**
     * when I come into the gateway with a /googlesearch request, we
     * will redirect to google.com.
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator googleConfig(RouteLocatorBuilder builder) {

        return builder.routes()
                .route(r -> r.path("/googlesearch")
                        .uri("https://google.com")
                        .id("google"))
                .build();

    }
}

