package com.rocketseat.planner.participant;

import com.rocketseat.planner.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipantRepository extends JpaRepository<Participant , UUID> {
}
