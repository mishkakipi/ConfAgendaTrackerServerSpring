package com.afeka.advcell.finalproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afeka.advcell.finalproject.db.model.ConferenceSession;
import com.afeka.advcell.finalproject.db.model.ConferenceSessions;
import com.afeka.advcell.finalproject.managers.ConferenceAPIManager;

@RestController
public class ConferenceAPIController {
	private static final Logger LOG = Logger.getLogger(ConferenceAPIController.class);
	Date date = new Date();
	SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
	@Autowired
	ConferenceAPIManager conferenceAPIManager;
	
	@RequestMapping(value = "/conference/agenda", method = RequestMethod.GET)
	public ConferenceSessions getConferenceSessions() {
		LOG.info("Started processing getConferenceSessions request.");
		long startTime = System.currentTimeMillis();
		List<ConferenceSession> sessionList = conferenceAPIManager.getConferenceSessions();
		ConferenceSessions conferenceSessions = new ConferenceSessions(sessionList, dt.format(date), "My Conference");
		long endTime = System.currentTimeMillis();	
		LOG.info("Finished processing get work to do request.");
		LOG.info("Duration: "+(endTime-startTime)+" ms.");
		LOG.info("Returning: " + conferenceSessions);
		return conferenceSessions;
	}
}
