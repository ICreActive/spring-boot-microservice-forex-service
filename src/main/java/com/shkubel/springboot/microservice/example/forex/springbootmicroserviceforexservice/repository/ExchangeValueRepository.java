package com.shkubel.springboot.microservice.example.forex.springbootmicroserviceforexservice.repository;

import com.shkubel.springboot.microservice.example.forex.springbootmicroserviceforexservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository <ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
