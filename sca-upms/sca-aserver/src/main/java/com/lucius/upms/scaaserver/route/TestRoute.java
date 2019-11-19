package com.lucius.upms.scaaserver.route;

import com.lucius.upms.scaaserver.handle.TestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class TestRoute {

    @Bean
    RouterFunction<ServerResponse> testRouteFun(TestHandler testHandler){
        return RouterFunctions.route(RequestPredicates.path("/test"), testHandler::test);
    }

}
