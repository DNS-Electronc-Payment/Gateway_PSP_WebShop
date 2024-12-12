package com.example.Gateway_PSP_WebShop.predicate;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.web.server.ServerWebExchange;

import java.util.function.Predicate;

public class CustomPredicate extends AbstractRoutePredicateFactory<CustomPredicate.Config> {
    public static class Config {
    }

    public CustomPredicate() {
        super(Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return exchange -> {
            return exchange.getRequest().getHeaders().containsKey("X-Custom-Header");
        };
    }
}