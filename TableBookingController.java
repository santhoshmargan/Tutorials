package com.santhosh.book.ticket.app.controller;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.book.ticket.app.entities.RestaurantTable;
import com.santhosh.book.ticket.app.service.TableBookingService;
import com.sun.istack.logging.Logger;

@RestController
@RequestMapping(value="/api/tickets")
public class TableBookingController {
	
	 private Log log = LogFactory.getLog(TableBookingController.class);
	
		@Autowired
		private TableBookingService tableBookingService;
		
		//To Create a new Ticket (note:ableId is auto Generated)
	    @PostMapping(value="/book-table", consumes="application/json")
		public String bookTable(@RequestBody RestaurantTable table)
		{
			return tableBookingService.bookTable(table);
		}
	    
		// Cancel ticket
		@GetMapping(value = "/cancel-ticket")
		public Optional<RestaurantTable> getTicketByMobile(@RequestBody RestaurantTable table) {
			try {
				return tableBookingService.getTableByMobileNo(table);
			} catch (Exception ex) {
				log.error("Exception:" + ex.getMessage(), ex);
			}
			return null;
		}
	    
	    // Updating the ticket
	    @PutMapping(value="/update-ticket")
	    public RestaurantTable updateTable(@PathVariable("ticketId")Integer tableId, @PathVariable("newEmail")String newEmail)
	    {	
	    	
	    	return tableBookingService.updateTable(tableId,newEmail);
	    }
	    
		@GetMapping(value = "/findAllTable")
		public Iterable<RestaurantTable> findAllTable() {
			return tableBookingService.findAllTable();
		}

	}
