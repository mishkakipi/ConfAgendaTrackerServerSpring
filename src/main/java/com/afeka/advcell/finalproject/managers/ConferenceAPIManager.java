package com.afeka.advcell.finalproject.managers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.afeka.advcell.finalproject.db.ConferenceSessionRepository;
import com.afeka.advcell.finalproject.db.model.ConferenceSession;

@Component
public class ConferenceAPIManager {
	
	@Autowired
	private ConferenceSessionRepository conferenceSessionRepository;
	
	public List<ConferenceSession> getConferenceSessions() {
		Date date = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
		List<ConferenceSession> dbSessions = conferenceSessionRepository.findSessionsByDateOrderByStartTime(dt.format(date));
		return dbSessions;
	}
}
