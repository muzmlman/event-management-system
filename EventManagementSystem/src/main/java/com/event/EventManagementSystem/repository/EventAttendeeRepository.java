package com.event.EventManagementSystem.repository;

import com.event.EventManagementSystem.model.EventAttendee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventAttendeeRepository extends JpaRepository<EventAttendee, EventAttendee.EventAttendeeKey> {
    List<EventAttendee> findByEventId(Long eventId);
}


