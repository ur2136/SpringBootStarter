package com.personal.starter.models;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;

@Entity(name="speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Speaker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long speaker_id;
	private String first_name;
	private String last_name;
	private String title;
	private String company;
	private String speaker_bio;
	
	@Lob
	private byte[] speaker_photo;
	
	@ManyToMany(mappedBy = "speakers")
	@JsonIgnore
	private List<Session> sessions;
	
	public void setSpeaker_id(Long speaker_id) {
		this.speaker_id = speaker_id;
	}
	
	public Long getSpeaker_id() {
		return speaker_id;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setSpeaker_bio(String speaker_bio) {
		this.speaker_bio = speaker_bio;
	}
	
	public String getSpeaker_bio() {
		return speaker_bio;
	}
	
	public void setSpeaker_photo(byte[] speaker_photo) {
		this.speaker_photo = speaker_photo;
	}
	
	public byte[] getSpeaker_photo() {
		return speaker_photo;
	}
	
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
	public List<Session> getSessions() {
		return sessions;
	}
	
	public Speaker() {
	}

}
