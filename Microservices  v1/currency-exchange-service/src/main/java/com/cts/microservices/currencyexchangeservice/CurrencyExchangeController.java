package com.cts.microservices.currencyexchangeservice;

//import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private ExchangeValueRepository repository;
	
	@Autowired
	private Environment environment;//gives the port number
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to){
		
		//ExchangeValue exchangevalue=new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
		
		ExchangeValue exchangevalue=repository.findByFromAndTo(from, to);
		exchangevalue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchangevalue;
	}
		
}
