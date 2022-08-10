package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	private Instant fromDate;
	private Instant toDate;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	
	
	@OneToOne(mappedBy = "booking")
    private ReviewEntity review;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apartment_id", referencedColumnName = "id")
	private ApartmentEntity apartment;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
	private InvoiceEntity invoice;
	

	public BookingEntity(Integer id, Instant fromDate, Instant toDate, ReviewEntity review, ApartmentEntity apartment,
			InvoiceEntity invoice, Instant createdAt, Instant lastUpdatedAt) {
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.review = review;
		this.apartment = apartment;
		this.invoice = invoice;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
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
	
	@Override
	public String toString() {
		return "BookingEntity [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", review=" + review
				+ ", apartment=" + apartment + ", invoice=" + invoice + ", createdAt=" + createdAt + ", lastUpdatedAt=" + lastUpdatedAt + "]";
	}
	
}
