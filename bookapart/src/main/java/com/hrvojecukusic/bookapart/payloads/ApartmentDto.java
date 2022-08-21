package com.hrvojecukusic.bookapart.payloads;


import lombok.Data;

@Data
public class ApartmentDto {
	private Integer id;
	private String name;
	private String description;
	private int numberOfGuests;
	private int numberOfRooms;
	private int numberOfShowers;
	private double basePrice;
	private double cleaningFee;
	private double serviceFee;
	private String address;
	private int city_id;
	private int host_id;
}
