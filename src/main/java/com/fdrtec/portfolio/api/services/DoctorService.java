package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Doctor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DoctorService {
    Flux<Doctor> findAll();
    Mono<Doctor> findById(String id);
    Mono<Doctor>save(Doctor doctor);
    Mono<Void> delete(Doctor doctor);
}

