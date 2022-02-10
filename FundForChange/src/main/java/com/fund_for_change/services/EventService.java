package com.fund_for_change.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fund_for_change.domain.Event;
import com.fund_for_change.dto.EventDTO;
import com.fund_for_change.dto.UserDTO;

@Service
public interface EventService {
	public Event saveEvent(EventDTO eventDto);

	public List<Event> getEvents();
	
	public Event getEventById(String id);

	public Event updateEvent(Event event);

	public void deleteEvent(Event event);

}
