package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockPrice;
@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable> {
	public Double findByCompanyName(String companyName);
}
