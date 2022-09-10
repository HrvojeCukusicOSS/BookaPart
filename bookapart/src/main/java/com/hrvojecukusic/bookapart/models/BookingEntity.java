package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;


@Entity
public class BookingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	@Column(name="from_date")
	private Instant fromDate;
	@Column(name="to_date")
	private Instant toDate;
	@Column(name="created_at")
	private Instant createdAt;
	@Column(name="last_updated_at")
	private Instant lastUpdatedAt;
	
	
	@OneToOne(mappedBy = "booking")
    private ReviewEntity review;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apartment_id", referencedColumnName = "id")
	private ApartmentEntity apartment;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
	private InvoiceEntity invoice;

	public BookingEntity(Integer id, Instant fromDate, Instant toDate, Instant createdAt, Instant lastUpdatedAt, ReviewEntity review, ApartmentEntity apartment, InvoiceEntity invoice) {
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
		this.review = review;
		this.apartment = apartment;
		this.invoice = invoice;
	}

	public BookingEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getFromDate() {
		return fromDate;
	}

	public void setFromDate(Instant fromDate) {
		this.fromDate = fromDate;
	}

	public Instant getToDate() {
		return toDate;
	}

	public void setToDate(Instant toDate) {
		this.toDate = toDate;
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

	public ReviewEntity getReview() {
		return review;
	}

	public void setReview(ReviewEntity review) {
		this.review = review;
	}

	public ApartmentEntity getApartment() {
		return apartment;
	}

	public void setApartment(ApartmentEntity apartment) {
		this.apartment = apartment;
	}

	public InvoiceEntity getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceEntity invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		return "BookingEntity{" +
				"id=" + id +
				", fromDate=" + fromDate +
				", toDate=" + toDate +
				", createdAt=" + createdAt +
				", lastUpdatedAt=" + lastUpdatedAt +
				'}';
	}
}
