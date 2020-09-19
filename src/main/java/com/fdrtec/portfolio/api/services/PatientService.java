package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Patient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PatientService {

    Flux<Patient> findAll();

    Mono<Patient> findById(String id);

    Mono<Patient> save(Patient patient);

    Mono<Void> delete(Patient patient);

}
