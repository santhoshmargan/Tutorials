package com.santhosh.book.ticket.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RestaurantTable {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "table_no")
	private Integer table_no;
	
	@Id
	@Column(name = "mobile_no")
	private String mobile_no;

	@Column(name = "booking_date")
	private LocalDate booking_date;

	@Column(name = "people_count")
	private Integer people_count;
	
	@Column(name = "table_size")
	private Integer table_size;
	
	@Column(name = "fourCapacityRemanining")
	private Integer fourCapacityRemanining;
	
	@Column(name = "twoCapacityRemanining")
	private Integer twoCapacityRemanining;
	
	

	public Integer getTable_size() {
		return table_size;
	}

	public void setTable_size(Integer table_size) {
		this.table_size = table_size;
	}

	public Integer getTable_no() {
		return table_no;
	}

	public void setTable_no(Integer table_no) {
		this.table_no = table_no;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public LocalDate getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(LocalDate booking_date) {
		this.booking_date = booking_date;
	}

	public Integer getPeople_count() {
		return people_count;
	}

	public void setPeople_count(Integer people_count) {
		this.people_count = people_count;
	}

	public Integer getFourCapacityRemanining() {
		return fourCapacityRemanining;
	}

	public void setFourCapacityRemanining(Integer fourCapacityRemanining) {
		this.fourCapacityRemanining = fourCapacityRemanining;
	}

	public Integer getTwoCapacityRemanining() {
		return twoCapacityRemanining;
	}

	public void setTwoCapacityRemanining(Integer twoCapacityRemanining) {
		this.twoCapacityRemanining = twoCapacityRemanining;
	}

}
