package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Doctor;
import com.fdrtec.portfolio.api.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Service
public class DoctorServiceImpl implements DoctorService {
    private static Logger LOGGER = Logger.getLogger("com.fdrtec.portfolio.api.services.DoctorService");

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Flux<Doctor> findAll() {
        try {
            return doctorRepository.findAll();
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Doctor> findById(String id) {
        try {
            return doctorRepository.findById(id);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Doctor> save(Doctor doctor) {
        try {
            return doctorRepository.save(doctor);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Void> delete(Doctor doctor) {
        try {
            return doctorRepository.delete(doctor);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }


    private void callLoggerService(Exception e) {
        LOGGER.severe("info: " + e);
    }
}
