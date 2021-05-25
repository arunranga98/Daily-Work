package com.cts.training.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.Buildable;
//import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
						.filters(f -> f
								.addRequestHeader("MyHeader", "MyURI")
								.addRequestParameter("Param","MyValue"))
						.uri("http://httpbin.org:80"))
				.route(p -> p.path("/currency-exchange/**")
							.uri("lb://currency-exchange"))
				.route(p -> p.path("/currency-conversion-service/**")
							.uri("lb://currency-conversion-service"))
				.route(p -> p.path("/currency-conversion-service-feign/**")
							.uri("lb://currency-conversion-service"))
				.route(p -> p.path("/currency-conversion-service-new/**")
						.filters(f->f.rewritePath
								("/currency-conversion-service-new/(?<segment>.*)",
										"/currency-conversion-service-feign/${segment}"))
						.uri("lb://currency-conversion-service"))
				.build();
	}
}
