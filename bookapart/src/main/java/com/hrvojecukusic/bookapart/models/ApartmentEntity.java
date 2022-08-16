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
	public Integer id;
	
	@Column(name="name")
	public String name;
	@Column(name="description")
	public String description;
	@Column(name="number_of_guests")
	public int numberOfGuests;
	@Column(name="number_of_rooms")
	public int numberOfRooms;
	@Column(name="number_of_showers")
	public int numberOfShowers;
	@Column(name="base_price")
	public double basePrice;
	@Column(name="cleaning_fee")
	public double cleaningFee;
	@Column(name="service_fee")
	public double serviceFee;
	@Column(name="address")
	public String address;
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
