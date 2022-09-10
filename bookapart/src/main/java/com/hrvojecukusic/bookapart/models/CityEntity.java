package com.hrvojecukusic.bookapart.models;

import java.time.Instant;
import java.util.Set;

import javax.persistence.*;

@Entity
public class CityEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;
	@Column(name="province")
	private String province;
	@Column(name="created_at")
	private Instant createdAt;
	@Column(name="last_updated_at")
	private Instant lastUpdatedAt;
	
	@OneToMany(mappedBy="city")
    private Set<ApartmentEntity> apartments;

	public CityEntity(Integer id, String name, String country, String province, Instant createdAt, Instant lastUpdatedAt, Set<ApartmentEntity> apartments) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.province = province;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
		this.apartments = apartments;
	}

	public CityEntity() {
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
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

	public Set<ApartmentEntity> getApartments() {
		return apartments;
	}

	public void setApartments(Set<ApartmentEntity> apartments) {
		this.apartments = apartments;
	}

	@Override
	public String toString() {
		return "CityEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				", country='" + country + '\'' +
				", province='" + province + '\'' +
				", createdAt=" + createdAt +
				", lastUpdatedAt=" + lastUpdatedAt +
				'}';
	}
}
