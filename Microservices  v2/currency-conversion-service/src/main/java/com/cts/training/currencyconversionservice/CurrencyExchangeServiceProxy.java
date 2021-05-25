package com.cts.training.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.cts.microservices.currencyexchangeservice.ExchangeValue;

//import org.springframework.cloud.netflix.feign.FeignClient;

//@FeignClient(name="currency-exchange-service",url="localhost:8000")
@FeignClient("currency-exchange")
public interface CurrencyExchangeServiceProxy {
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from,@PathVariable("to") String to);
}
