package com.hrvojecukusic.bookapart.payloads;

import lombok.Data;

import java.time.Instant;
@Data
public class BookingDto {
    private Integer id;
    private Instant fromDate;
    private Instant toDate;
    private Instant createdAt;
    private Instant lastUpdatedAt;
    private String review;
    private String apartment;
}
