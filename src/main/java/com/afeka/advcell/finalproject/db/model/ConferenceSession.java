package com.afeka.advcell.finalproject.db.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ConferenceSession")
public class ConferenceSession {
	@Id
	public String id;
	@Field("title")
	public String title;
	@Field("speaker")
	public String speaker;
	@Field("location")
	public String location;
	@Field("startTime")
	public String startTime;
	@Field("endTime")
	public String endTime;
	@Field("date")
	public String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ConferenceSession(String id, String title, String speaker, String location, String startTime, String endTime,
			String date) {
		super();
		this.id = id;
		this.title = title;
		this.speaker = speaker;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
	public ConferenceSession() {
		super();
	}
	
	@Override
	public String toString() {
		return "ConferenceSession[id=" + id + ", title=" + title + ", speaker=" + speaker + ", location="
				+ location + ", startTime=" + startTime + ", endTime=" + endTime + ", date="
				+ date + "]";
	}
}
