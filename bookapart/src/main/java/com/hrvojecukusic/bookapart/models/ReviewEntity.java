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
	
	@OneToOne(mappedBy = "review")
    private BookingEntity booking;
	
	private String content;
	private String summary;
	private int score;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	
	public ReviewEntity(Integer id, UserEntity guest, ApartmentEntity apartment, BookingEntity booking,
			String content, String summary, int score, Instant createdAt, Instant lastUpdatedAt) {
		this.id = id;
		this.guest = guest;
		this.apartment = apartment;
		this.booking = booking;
		this.content = content;
		this.summary = summary;
		this.score = score;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}
	
	public ReviewEntity() {
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
	public BookingEntity getBooking() {
		return booking;
	}
	public void setBooking(BookingEntity booking) {
		this.booking = booking;
	}
	public String getcontent() {
		return content;
	}
	public void setcontent(String content) {
		this.content = content;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
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
		return "ReviewEntity [id=" + id + ", guest=" + guest + ", apartment=" + apartment + ", booking=" + booking
				+ ", content=" + content + ", summary=" + summary + ", score=" + score + createdAt + ", lastUpdatedAt=" + lastUpdatedAt +  "]";
	}
}
