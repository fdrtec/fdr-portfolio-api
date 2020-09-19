package com.fdrtec.portfolio.api.controller;

import com.fdrtec.portfolio.api.document.Patient;
import com.fdrtec.portfolio.api.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping(value = "/patient")
    public Flux<Patient> getPatients() {
        return patientService.findAll();
    }

    @GetMapping(value = "/patient/{id}")
    public Mono<Patient> getPatientById(@PathVariable String id) {
        return patientService.findById(id);
    }

    @PostMapping(value = "/patient")
    public Mono<Patient> save(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @DeleteMapping(value = "/patient")
    public Mono<Void> delete(@RequestBody Patient patient) {
        return patientService.delete(patient);
    }
}
