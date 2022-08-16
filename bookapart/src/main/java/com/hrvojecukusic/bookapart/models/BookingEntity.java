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
	
}
