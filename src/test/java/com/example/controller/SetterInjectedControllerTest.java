package com.example.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.service.BookingServiceImpl;

public class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setBookingService(new BookingServiceImpl());
	}
	
	@Test
	public void testBooking() {
		assertEquals("str",setterInjectedController.booking());
	}

}
