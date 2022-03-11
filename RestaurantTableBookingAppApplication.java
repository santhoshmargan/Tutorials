package com.santhosh.book.ticket.app;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.santhosh.book.ticket.app.entities.RestaurantTable;
import com.santhosh.book.ticket.app.service.TableBookingService;

@SpringBootApplication
public class RestaurantTableBookingAppApplication{
	
	@Autowired
	TableBookingService tableBookingService;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantTableBookingAppApplication.class, args);
	}
	/*
	 * @Override public void run(String... args) throws Exception { RestaurantTable
	 * table= new RestaurantTable(); table.setMobile_no("9988776655");
	 * table.setBooking_date(LocalDate.now()); table.setPeople_count(4);
	 * tableBookingService.bookTable(table); }
	 */

}
