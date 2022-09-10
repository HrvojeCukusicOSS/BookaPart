package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;

import java.util.Set;

@Entity
public class UserEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="sex")
	private String sex;
	
	@OneToMany(mappedBy="host")
	private Set<ApartmentEntity> apartments;
	@OneToMany(mappedBy="guest")
	private Set<ReviewEntity> reviews;
	@OneToMany(mappedBy="guest")
	private Set<InvoiceEntity> invocies;
	
	@Column(name="date_of_birht")
	private Instant dateOfBirth;
	@Column(name="address")
	private String address;
	@Column(name="mobile")
	private String mobile;
	@Column(name="email")
	private String email;
	@Column(name="role")
	private String role;
	@Column(name="trusted")
	private boolean trusted;
	@Column(name="created_at")
	private Instant createdAt;
	@Column(name="last_updated_at")
	private Instant lastUpdatedAt;

	public UserEntity(Integer id, String firstName, String lastName, String sex, Set<ApartmentEntity> apartments, Set<ReviewEntity> reviews, Set<InvoiceEntity> invocies, Instant dateOfBirth, String address, String mobile, String email, String role, boolean trusted, Instant createdAt, Instant lastUpdatedAt) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.apartments = apartments;
		this.reviews = reviews;
		this.invocies = invocies;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.role = role;
		this.trusted = trusted;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public UserEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<ApartmentEntity> getApartments() {
		return apartments;
	}

	public void setApartments(Set<ApartmentEntity> apartments) {
		this.apartments = apartments;
	}

	public Set<ReviewEntity> getReviews() {
		return reviews;
	}

	public void setReviews(Set<ReviewEntity> reviews) {
		this.reviews = reviews;
	}

	public Set<InvoiceEntity> getInvocies() {
		return invocies;
	}

	public void setInvocies(Set<InvoiceEntity> invocies) {
		this.invocies = invocies;
	}

	public Instant getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Instant dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isTrusted() {
		return trusted;
	}

	public void setTrusted(boolean trusted) {
		this.trusted = trusted;
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
		return "UserEntity{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", sex='" + sex + '\'' +
				", dateOfBirth=" + dateOfBirth +
				", address='" + address + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", role='" + role + '\'' +
				", trusted=" + trusted +
				", createdAt=" + createdAt +
				", lastUpdatedAt=" + lastUpdatedAt +
				'}';
	}
}
