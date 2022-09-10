package com.hrvojecukusic.bookapart.mappers;

import com.hrvojecukusic.bookapart.models.ApartmentEntity;
import com.hrvojecukusic.bookapart.payloads.ApartmentDto;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Generated(
        value="org.mapstruct.ap.MappingProcessor",
        date="2021-03-11T19:21:44+0100",
        comments="version: 1.4.2.Final, compiler: javac, enviroment: Java 13.0.2 (Oracle Corporation)"
)

@Component
public class ApartmentMapper {
    public ApartmentDto apartmentToApartmentDto(ApartmentEntity apartment){
        if(apartment == null){
            return null;
        }
        var apartmentDto = new ApartmentDto();

        apartmentDto.setId(apartment.getId());
        apartmentDto.setName(apartment.getName());
        apartmentDto.setDescription(apartment.getDescription());
        apartmentDto.setNumberOfGuests(apartment.getNumberOfGuests());
        apartmentDto.setNumberOfRooms(apartment.getNumberOfRooms());
        apartmentDto.setNumberOfShowers(apartment.getNumberOfShowers());
        apartmentDto.setCleaningFee(apartment.getCleaningFee());
        apartmentDto.setServiceFee(apartment.getServiceFee());
        apartmentDto.setAddress(apartment.getAddress());
        apartmentDto.setCity(apartment.getCity().getName());
        apartmentDto.setHost(apartment.getHost().getFirstName() + " " + apartment.getHost().getLastName());

        return  apartmentDto;
    }
}
