package com.example.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.service.BookingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new BookingServiceImpl());
	}
	
	@Test
	public void testBooking() {
		assertEquals("str", constructorInjectedController.booking() );
		
	}

}
