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
	
	private double taxFee;
	private double discount;
	private double fullAmount;
	private Instant dateOfExcange;
	private String paidBy;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	
	public InvoiceEntity(Integer id, UserEntity guest, ApartmentEntity apartment, double taxFee, double discount,
			double fullAmount, Instant dateOfExcange, String paidBy, Instant createdAt, Instant lastUpdatedAt) {
		this.id = id;
		this.guest = guest;
		this.apartment = apartment;
		this.taxFee = taxFee;
		this.discount = discount;
		this.fullAmount = fullAmount;
		this.dateOfExcange = dateOfExcange;
		this.paidBy = paidBy;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}
	
	public InvoiceEntity() {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserEntity getGuest() {
		return guest;
	}
	public void setGuest(UserEntity guest) {
		this.guest = guest;
	}
	public ApartmentEntity getApartment() {
		return apartment;
	}
	public void setApartment(ApartmentEntity apartment) {
		this.apartment = apartment;
	}
	public double getTaxFee() {
		return taxFee;
	}
	public void setTaxFee(double taxFee) {
		this.taxFee = taxFee;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFullAmount() {
		return fullAmount;
	}
	public void setFullAmount(double fullAmount) {
		this.fullAmount = fullAmount;
	}
	public Instant getDateOfExcange() {
		return dateOfExcange;
	}
	public void setDateOfExcange(Instant dateOfExcange) {
		this.dateOfExcange = dateOfExcange;
	}
	public String getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
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
		return "InvoiceEntity [id=" + id + ", guest=" + guest + ", apartment=" + apartment + ", taxFee=" + taxFee
				+ ", discount=" + discount + ", fullAmount=" + fullAmount+ ", dateOfExcange=" + dateOfExcange + 
				", paipBy=" + paidBy +  createdAt + ", lastUpdatedAt=" + lastUpdatedAt + "]";
	}
	
}
