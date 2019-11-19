package com.lucius.upms.scaaserver.handle;

import com.alibaba.csp.sentinel.adapter.reactor.SentinelReactorTransformer;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lucius.scadubbointerface.serrvice_interface.FirstService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

@Component
@RefreshScope
public class TestHandler {

    @Value("${user.id}")
    private String id;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @Reference
    FirstService firstService;

    public Mono<ServerResponse> test(ServerRequest request){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(
//                        Flux.interval(Duration.ofSeconds(1))
//                        .map(l -> new SimpleDateFormat("HH:mm:ss")
//                                .format(new Date())+ " " +firstService.getName(name))
                        Mono.just(firstService.getName(name))
                        ,String.class
                );
    }
}
