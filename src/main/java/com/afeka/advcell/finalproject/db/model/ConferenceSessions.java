package com.afeka.advcell.finalproject.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConferenceSessions {
	public List<ConferenceSession> sessions = new ArrayList<ConferenceSession>();
	public String date = "";
	public String name = "";
	public ConferenceSessions(List<ConferenceSession> sessions, String date, String name) {
		super();
		this.sessions = sessions;
		this.date = date;
		this.name = name;
	}
	public ConferenceSessions() {
		super();
	}
	public List<ConferenceSession> getSessions() {
		return sessions;
	}
	public void setSessions(List<ConferenceSession> sessions) {
		this.sessions = sessions;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
