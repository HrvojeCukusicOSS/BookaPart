package com.hrvojecukusic.bookapart.models;

import java.time.Instant;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
