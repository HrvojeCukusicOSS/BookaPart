package com.hrvojecukusic.bookapart.models;

import java.time.Instant;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewEntity {
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
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
	private BookingEntity booking;
	
	@Column(name="content")
	private String content;
	@Column(name="summary")
	private String summary;
	@Column(name="score")
	private int score;
	@Column(name="created_at")
	private Instant createdAt;
	@Column(name="last_updated_at")
	private Instant lastUpdatedAt;
	
}
