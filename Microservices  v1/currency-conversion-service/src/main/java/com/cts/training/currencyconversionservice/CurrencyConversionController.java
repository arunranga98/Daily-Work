package com.cts.training.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		Map<String,String> urivariables=new HashMap<>();
		urivariables.put("from", from);
		urivariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,urivariables);
		
		CurrencyConversionBean response=responseEntity.getBody();
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());	
		
		//return new CurrencyConversionBean(1L,from,to,BigDecimal.ONE,quantity,quantity,0);
	}
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyf(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		
		CurrencyConversionBean response=proxy.retrieveExchangeValue(from, to);
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());	
		
		//return new CurrencyConversionBean(1L,from,to,BigDecimal.ONE,quantity,quantity,0);
	}
	
}
