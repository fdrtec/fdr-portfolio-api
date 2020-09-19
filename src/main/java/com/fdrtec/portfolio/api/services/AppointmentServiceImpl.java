package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Appointment;
import com.fdrtec.portfolio.api.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private static Logger LOGGER = Logger.getLogger("com.fdrtec.portfolio.api.services.AppointmentService");

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Flux<Appointment> findAll() {
        try {
            return appointmentRepository.findAll();
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Appointment> findById(String id) {
        try {
            return appointmentRepository.findById(id);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Appointment> save(Appointment appointment) {
        try {
            return appointmentRepository.save(appointment);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Void> delete(Appointment appointment) {
        try {
            return appointmentRepository.delete(appointment);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }


    private void callLoggerService(Exception e) {
        LOGGER.severe("info: " + e);
    }
}
