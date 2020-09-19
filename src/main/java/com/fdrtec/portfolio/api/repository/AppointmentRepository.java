package com.fdrtec.portfolio.api.repository;

import com.fdrtec.portfolio.api.document.Appointment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends ReactiveMongoRepository<Appointment, String> {
}
