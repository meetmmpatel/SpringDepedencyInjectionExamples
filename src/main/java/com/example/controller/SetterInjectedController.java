package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.service.BookingService;

@Controller
public class SetterInjectedController {
	
	private BookingService bookingService;

	@Autowired
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public String booking() {
		System.out.println("This is from setter injections");
		return bookingService.bookTrip();
	}
	
	
	
	

}
