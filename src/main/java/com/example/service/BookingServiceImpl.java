package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl  implements BookingService
{

	@Override
	public String bookTrip() {
	    System.out.println("Booking the trip for our customer");
	    return "str";
		
	}

}
