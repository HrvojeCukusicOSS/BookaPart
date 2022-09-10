package com.hrvojecukusic.bookapart.mappers;

import com.hrvojecukusic.bookapart.models.BookingEntity;
import com.hrvojecukusic.bookapart.payloads.BookingDto;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Generated(
        value="org.mapstruct.ap.MappingProcessor",
        date="2021-03-11T19:21:44+0100",
        comments="version: 1.4.2.Final, compiler: javac, enviroment: Java 13.0.2 (Oracle Corporation)"
)

@Component
public class BookingMapper {
    public BookingDto bookingToBookingDto(BookingEntity booking){
        if(booking == null){
            return null;
        }
        var bookingDto = new BookingDto();

        bookingDto.setId(booking.getId());
        bookingDto.setFromDate(booking.getFromDate());
        bookingDto.setToDate(booking.getToDate());
        bookingDto.setCreatedAt(booking.getCreatedAt());
        bookingDto.setLastUpdatedAt(booking.getLastUpdatedAt());
        bookingDto.setReview(booking.getReview().getContent());
        bookingDto.setApartment(booking.getApartment().getName());

        return  bookingDto;
    }
}
