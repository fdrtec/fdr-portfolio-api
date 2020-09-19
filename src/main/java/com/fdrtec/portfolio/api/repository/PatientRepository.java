package com.fdrtec.portfolio.api.repository;

import com.fdrtec.portfolio.api.document.Patient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends ReactiveMongoRepository<Patient, String> {
}