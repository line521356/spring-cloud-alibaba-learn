package com.lucius.gateway.scagateway.route;

import com.lucius.gateway.scagateway.handle.OtherHandle;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Map;
import java.util.function.Function;

@Configuration
public class GatewayRouter {

    @Bean
    RouterFunction <ServerResponse> fallback(OtherHandle otherHandle){
        return RouterFunctions.route(RequestPredicates.path("/fallback"),otherHandle::fallback);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/aserver/**")
//                        .uri("lb://aserver"))
//                .build();
//    }

}
