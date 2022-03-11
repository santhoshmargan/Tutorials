package com.santhosh.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.santhosh.book.ticket.app.entities.RestaurantTable;

@Repository
public interface TableBookingDao extends CrudRepository<RestaurantTable, String>{

	
}