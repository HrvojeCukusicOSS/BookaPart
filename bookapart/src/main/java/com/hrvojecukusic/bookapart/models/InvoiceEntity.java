package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="guest_id", insertable=false, updatable=false)
	private UserEntity guest;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apartment_id", referencedColumnName = "id")
	private ApartmentEntity apartment;
	
	@Column(name="tax_fee")
	private double taxFee;
	@Column(name="discount")
	private double discount;
	@Column(name="full_amount")
	private double fullAmount;
	@Column(name="date_of_excange")
	private Instant dateOfExcange;
	@Column(name="paid_by")
	private String paidBy;
	@Column(name="created_at")
	private Instant createdAt;
	@Column(name="last_updated_at")
	private Instant lastUpdatedAt;
		
}
