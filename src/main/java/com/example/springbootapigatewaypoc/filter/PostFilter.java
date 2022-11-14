package com.example.springbootapigatewaypoc.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PostFilter extends AbstractGatewayFilterFactory {


    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            return chain.filter(exchange).doOnSuccess(res->
                    log.info("Post filter executed")
            );
        };
    }
}
