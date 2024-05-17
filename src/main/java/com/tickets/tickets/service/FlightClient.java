package com.tickets.tickets.service;

import com.tickets.tickets.model.FlightDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name="flight-server")
public interface FlightClient {
    @GetMapping("/vuelos")
    List<FlightDto> getAllFlights();

}
