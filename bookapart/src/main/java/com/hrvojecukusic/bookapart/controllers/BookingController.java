package com.hrvojecukusic.bookapart.controllers;

import com.hrvojecukusic.bookapart.models.BookingEntity;
import com.hrvojecukusic.bookapart.payloads.BookingDto;
import com.hrvojecukusic.bookapart.services.ApartmentService;
import com.hrvojecukusic.bookapart.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private ApartmentService apartmentService;

    public BookingController(BookingService bookingService, ApartmentService apartmentService) {
        this.bookingService = bookingService;
        this.apartmentService = apartmentService;
    }

    @GetMapping("/booking")
    public String getBookingForApartment(Model model) {
        model.addAttribute("booking", new BookingDto());
        return "booking";
    }
    @PostMapping("/booking")
    public String getBookingForApartment(@ModelAttribute BookingDto booking, Model model) {
        model.addAttribute("booking", booking);
        return "invoice";
    }

}
