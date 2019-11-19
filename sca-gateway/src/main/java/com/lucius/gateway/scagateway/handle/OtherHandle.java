package com.lucius.gateway.scagateway.handle;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class OtherHandle {

    public Mono <ServerResponse> fallback(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.TEXT_HTML).body(Mono.just("fallback"),String.class);
    }
}
