package com.bloodbank.model;

import java.util.List;

public class EventList {

	public EventList() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Event> event;
	private List<AcceptEvent> accevent;
	@Override
	public String toString() {
		return "EventList [event=" + event + ", accevent=" + accevent + "]";
	}
	public EventList(List<Event> event, List<AcceptEvent> accevent) {
		super();
		this.event = event;
		this.accevent = accevent;
	}
	public List<Event> getEvent() {
		return event;
	}
	public void setEvent(List<Event> event) {
		this.event = event;
	}
	public List<AcceptEvent> getAccevent() {
		return accevent;
	}
	public void setAccevent(List<AcceptEvent> accevent) {
		this.accevent = accevent;
	}
	
	
	

}
