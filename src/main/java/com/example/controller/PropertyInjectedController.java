package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.service.BookingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	private BookingService bookingService;
	
	public String booking() {
		System.out.println("This is from property based injections");
		return bookingService.bookTrip();
	}
	
	

}
