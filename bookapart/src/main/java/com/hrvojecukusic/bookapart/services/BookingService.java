package com.hrvojecukusic.bookapart.services;

import com.hrvojecukusic.bookapart.mappers.BookingMapper;
import com.hrvojecukusic.bookapart.payloads.BookingDto;
import com.hrvojecukusic.bookapart.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private BookingMapper bookingMapper;

	public BookingDto getBookingById(int id) {
		var toMap = bookingRepository.findById(id).orElse(null);
		var booking = bookingMapper.bookingToBookingDto(toMap);
		return booking;
	}
}
