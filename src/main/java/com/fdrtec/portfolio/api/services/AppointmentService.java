package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Appointment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AppointmentService {

    Flux<Appointment> findAll();

    Mono<Appointment> findById(String id);

    Mono<Appointment> save(Appointment appointment);

    Mono<Void> delete(Appointment appointment);

}
