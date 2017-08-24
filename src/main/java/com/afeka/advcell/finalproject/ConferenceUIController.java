package com.afeka.advcell.finalproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.afeka.advcell.finalproject.db.ConferenceSessionRepository;
import com.afeka.advcell.finalproject.db.model.ConferenceSession;

@Controller
public class ConferenceUIController {
	@Autowired
	ConferenceSessionRepository conferenceSessionRepository;
	Date date = new Date();
	SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getCurrentSessions() {

		List<ConferenceSession> dbSessions = conferenceSessionRepository.findSessionsByDateOrderByStartTime(dt.format(date));
		ModelAndView model = new ModelAndView("sessionManager");
		model.addObject("page_title", "Conference Sessions");
		model.addObject("ConferenceSessions", dbSessions);
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView showAddSessionDetailsPage(
			@ModelAttribute(value = "newSessionDetails") ConferenceSession newSessionDetails) {
		ModelAndView model = new ModelAndView("conferenceSession_add");
		model.addObject("page_title", "Add New Conference Session");
		model.addObject("newSessionDetails", new ConferenceSession());
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView saveNewSessionDetails(
			@ModelAttribute(value = "newSessionDetails") ConferenceSession newSessionDetails) {
		newSessionDetails.date = dt.format(date);
		conferenceSessionRepository.save(newSessionDetails);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/update/{session_id}", method = RequestMethod.GET)
	public ModelAndView showUpdateSessionDetailsPage(@PathVariable(value = "session_id") String session_id) {
		ConferenceSession sessionToUpdate = conferenceSessionRepository.getConferenceSessionById(session_id);
		ModelAndView model = new ModelAndView("conferenceSession_update");
		model.addObject("page_title", "Edit Conference Session");
		model.addObject("sessionToUpdate", sessionToUpdate);
		return model;
	}

	@RequestMapping(value = "/update/{session_id}", method = RequestMethod.POST)
	public ModelAndView saveUpdateSessionDetailsPage(
			@ModelAttribute(value = "sessionToUpdate") ConferenceSession sessionToUpdate,
			@PathVariable(value = "session_id") String session_id) {
		sessionToUpdate.date = dt.format(date);
		conferenceSessionRepository.save(sessionToUpdate);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/delete/{session_id}", method = RequestMethod.GET)
	public ModelAndView saveDeleteSessionDetailsPage(@PathVariable(value = "session_id") String session_id) {
		conferenceSessionRepository.deleteConferenceSessionById(session_id);
		return new ModelAndView("redirect:/");
	}
}
