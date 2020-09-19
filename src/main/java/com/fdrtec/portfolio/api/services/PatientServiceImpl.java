package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Patient;
import com.fdrtec.portfolio.api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Service
public class PatientServiceImpl implements PatientService {
    private static Logger LOGGER = Logger.getLogger("com.fdrtec.portfolio.api.services.PatientService");

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Flux<Patient> findAll() {
        try {
            return patientRepository.findAll();
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Patient> findById(String id) {
        try {
            return patientRepository.findById(id);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Patient> save(Patient patient) {
        try {
            return patientRepository.save(patient);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }

    @Override
    public Mono<Void> delete(Patient patient) {
        try {
            return patientRepository.delete(patient);
        } catch (Exception e) {
            callLoggerService(e);
            return null;
        }
    }


    private void callLoggerService(Exception e) {
        LOGGER.severe("info: " + e);
    }
}
