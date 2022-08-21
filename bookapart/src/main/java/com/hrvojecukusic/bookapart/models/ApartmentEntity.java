package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="number_of_guests")
	private int numberOfGuests;
	@Column(name="number_of_rooms")
	private int numberOfRooms;
	@Column(name="number_of_showers")
	private int numberOfShowers;
	@Column(name="base_price")
	private double basePrice;
	@Column(name="cleaning_fee")
	private double cleaningFee;
	@Column(name="service_fee")
	private double serviceFee;
	@Column(name="address")
	private String address;
	@Column(name="created_at")
	private Instant createdAt;
	@Column(name="last_updated_at")
	private Instant lastUpdatedAt;
	
	@ManyToOne
	@JoinColumn(name="city_id", insertable=false, updatable=false)
	private CityEntity city;
	
	@ManyToOne
	@JoinColumn(name="host_id", insertable=false, updatable=false)
	private UserEntity host;
	
	@OneToOne(mappedBy = "apartment")
    private InvoiceEntity invoice;
	
	@OneToOne(mappedBy = "apartment")
    private ReviewEntity review;
	
}
