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
	
}
