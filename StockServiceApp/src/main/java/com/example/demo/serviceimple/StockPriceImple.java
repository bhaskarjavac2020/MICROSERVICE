package com.example.demo.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StockPriceRepository;
import com.example.demo.service.StockPriceService;
@Service
public class StockPriceImple implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepository;
	
	@Override
	public Double getStockPrice(String companyName) {
		Double stockPrice=stockPriceRepository.findByCompanyName(companyName);
		return stockPrice;
	}

}
