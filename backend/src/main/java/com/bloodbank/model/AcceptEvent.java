package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component

@Entity(name="accept_event")
public class AcceptEvent {

	public AcceptEvent() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ae_id")
	private int aEventId;
	
	@Column(name="ae_name")
	private String aEventName;
	
	@Column(name="ae_date")
	private String aEventDate;
	
	@Column(name="ae_location")
	private String aEventLocation;
	
	@Column(name="ae_description")
	private String aEventDescription;

	public AcceptEvent(int aEventId, String aEventName, String aEventDate, String aEventLocation,
			String aEventDescription) {
		super();
		this.aEventId = aEventId;
		this.aEventName = aEventName;
		this.aEventDate = aEventDate;
		this.aEventLocation = aEventLocation;
		this.aEventDescription = aEventDescription;
	}

	public AcceptEvent(String aEventName, String aEventDate, String aEventLocation, String aEventDescription) {
		super();
		this.aEventName = aEventName;
		this.aEventDate = aEventDate;
		this.aEventLocation = aEventLocation;
		this.aEventDescription = aEventDescription;
	}

	@Override
	public String toString() {
		return "AcceptEvent [aEventId=" + aEventId + ", aEventName=" + aEventName + ", aEventDate=" + aEventDate
				+ ", aEventLocation=" + aEventLocation + ", aEventDescription=" + aEventDescription + "]";
	}

	public int getaEventId() {
		return aEventId;
	}

	public void setaEventId(int aEventId) {
		this.aEventId = aEventId;
	}

	public String getaEventName() {
		return aEventName;
	}

	public void setaEventName(String aEventName) {
		this.aEventName = aEventName;
	}

	public String getaEventDate() {
		return aEventDate;
	}

	public void setaEventDate(String aEventDate) {
		this.aEventDate = aEventDate;
	}

	public String getaEventLocation() {
		return aEventLocation;
	}

	public void setaEventLocation(String aEventLocation) {
		this.aEventLocation = aEventLocation;
	}

	public String getaEventDescription() {
		return aEventDescription;
	}

	public void setaEventDescription(String aEventDescription) {
		this.aEventDescription = aEventDescription;
	}

	
	

}
