package com.fdrtec.portfolio.api.services;

import com.fdrtec.portfolio.api.document.Doctor;
import com.fdrtec.portfolio.api.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Flux<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Mono<Doctor> findById(String id) {
        return doctorRepository.findById(id);
    }

    @Override
    public Mono<Doctor> save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
