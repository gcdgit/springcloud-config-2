package com.atguigu.springcloud.config;

import java.time.ZonedDateTime;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2020-02-21 11:42
 */
@Configuration
public class GateWayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
    
    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("payment_routh3",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();

        return routes.build();
    }
    
    @Bean
    public RouteLocator customRouteLocator3(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("payment_routh",
                r -> r.path("/payment/**/**")
                        .uri("lb://cloud-payment-service/payment/**/**"))
        // 在同一个方法里面写两个
//        		.route("payment_routh2",
//        		r -> r.path("/payment/lb")
//        				.uri("lb://cloud-payment-service/payment/lb"))
        .build();
//
        return routes.build();
    }

    public static void main(String[] args) {
		ZonedDateTime zbj = ZonedDateTime.now();
		System.out.println(zbj);
		// 2020-07-24T10:35:53.088+08:00[Asia/Shanghai]
	}
}
