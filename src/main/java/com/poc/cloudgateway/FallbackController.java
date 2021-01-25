package com.poc.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/orderFallback")
    public Mono<String> orderFallback() {
        return Mono.just("Order-service is not responding, please try again later");
    }

    @GetMapping("/paymentFallback")
    public Mono<String> paymentFallback() {
        return Mono.just("Payment-service is not responding, please try again later");
    }
}
