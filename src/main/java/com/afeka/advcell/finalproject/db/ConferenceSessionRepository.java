package com.afeka.advcell.finalproject.db;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.afeka.advcell.finalproject.db.model.ConferenceSession;

public interface ConferenceSessionRepository  extends MongoRepository<ConferenceSession,String>{

	List<ConferenceSession> findSessionsByDateOrderByStartTime(String date);

	ConferenceSession getConferenceSessionById(String session_id);

	void deleteConferenceSessionById(String session_id);

}
