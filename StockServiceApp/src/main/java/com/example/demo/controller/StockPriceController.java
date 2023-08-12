package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StockPriceService;

@RestController
public class StockPriceController {
	@Autowired
	private StockPriceService priceService;
	
	@GetMapping("/stockprice/{companyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable("companyName") String companyName){
		Double stockPrice=priceService.getStockPrice(companyName);
		return new ResponseEntity<Double>(stockPrice,HttpStatus.OK);
	}
}
