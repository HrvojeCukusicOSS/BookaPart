package com.hrvojecukusic.bookapart.models;

import java.sql.Date;
import java.time.Instant;

import javax.persistence.*;

import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	private String firstName;
	private String lastName;
	private String sex;
	@OneToMany(mappedBy="host")
	private Set<ApartmentEntity> apartments;
	@OneToMany(mappedBy="guest")
	private Set<ReviewEntity> reviews;
	@OneToMany(mappedBy="guest")
	private Set<InvoiceEntity> invocies;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	private String address;
	private String mobile;
	private String email;
	private String role;
	private boolean trusted;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	
	public UserEntity(Integer id, String firstName, String lastName, String sex, Integer countryid,
			Integer stateid, Date dateOfBirth, String address, String mobile,
			String email, String role, boolean trusted, Instant createdAt, Instant lastUpdatedAt) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
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
	public boolean getTrusted() {
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
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex +
				", dateOfBirth=" + dateOfBirth + ", address=" + address + ", mobile=" + mobile
				+ ", email=" + email + ", role=" + role + ", trusted=" + trusted
				+ ", createdAt=" + createdAt + ", lastUpdatedAt=" + lastUpdatedAt +  "]";
	}
}
