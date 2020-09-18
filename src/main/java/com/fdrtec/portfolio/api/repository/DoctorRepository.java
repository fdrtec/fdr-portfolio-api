package com.fdrtec.portfolio.api.repository;

import com.fdrtec.portfolio.api.document.Doctor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DoctorRepository extends ReactiveMongoRepository<Doctor, String> {
}
