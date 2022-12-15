package org.example.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/films/**")
                        .uri("https://microservicefilmchallenge7-production.up.railway.app/"))
                .route(r -> r.path("/schedules/**")
                        .uri("https://microservicefilmchallenge7-production.up.railway.app/"))
                .route(r -> r.path("/users/**")
                        .uri("https://microserviceuserchallenge7-production.up.railway.app/"))
                .route(r -> r.path("/api/auth/**")
                        .uri("https://microserviceuserchallenge7-production.up.railway.app/"))
                .route(r -> r.path("/seats/**")
                        .uri("https://microserviceseatchallenge7-production.up.railway.app/"))
                .route(r -> r.path("/invoice/**")
                        .uri("https://microserviceinvoicechallenge7-production.up.railway.app/"))
                .route(r -> r.path("/post-message")
                        .uri("https://microservicekafkachallenge7-production.up.railway.app/"))
                .build();
    }
}

