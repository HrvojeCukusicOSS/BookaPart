package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;


@Entity
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
	@JoinColumn(name="city_id")
	private CityEntity city;
	
	@ManyToOne
	@JoinColumn(name="host_id")
	private UserEntity host;
	
	@OneToOne(mappedBy = "apartment")
    private InvoiceEntity invoice;
	
	@OneToOne(mappedBy = "apartment")
    private ReviewEntity review;

	public ApartmentEntity(Integer id, String name, String description, int numberOfGuests, int numberOfRooms, int numberOfShowers, double basePrice, double cleaningFee, double serviceFee, String address, Instant createdAt, Instant lastUpdatedAt, CityEntity city, UserEntity host, InvoiceEntity invoice, ReviewEntity review) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.numberOfGuests = numberOfGuests;
		this.numberOfRooms = numberOfRooms;
		this.numberOfShowers = numberOfShowers;
		this.basePrice = basePrice;
		this.cleaningFee = cleaningFee;
		this.serviceFee = serviceFee;
		this.address = address;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
		this.city = city;
		this.host = host;
		this.invoice = invoice;
		this.review = review;
	}

	public ApartmentEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getNumberOfShowers() {
		return numberOfShowers;
	}

	public void setNumberOfShowers(int numberOfShowers) {
		this.numberOfShowers = numberOfShowers;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getCleaningFee() {
		return cleaningFee;
	}

	public void setCleaningFee(double cleaningFee) {
		this.cleaningFee = cleaningFee;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Instant lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}

	public UserEntity getHost() {
		return host;
	}

	public void setHost(UserEntity host) {
		this.host = host;
	}

	public InvoiceEntity getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceEntity invoice) {
		this.invoice = invoice;
	}

	public ReviewEntity getReview() {
		return review;
	}

	public void setReview(ReviewEntity review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "ApartmentEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", numberOfGuests=" + numberOfGuests +
				", numberOfRooms=" + numberOfRooms +
				", numberOfShowers=" + numberOfShowers +
				", basePrice=" + basePrice +
				", cleaningFee=" + cleaningFee +
				", serviceFee=" + serviceFee +
				", address='" + address + '\'' +
				", createdAt=" + createdAt +
				", lastUpdatedAt=" + lastUpdatedAt +
				'}';
	}
}
