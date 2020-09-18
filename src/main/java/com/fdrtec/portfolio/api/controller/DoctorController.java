package com.fdrtec.portfolio.api.controller;

import com.fdrtec.portfolio.api.document.Doctor;
import com.fdrtec.portfolio.api.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping(value = "/doctor")
    public Flux<Doctor> getDoctors() {
        return doctorService.findAll();
    }

    @GetMapping(value = "/doctor/{id}")
    public Mono<Doctor> getDoctorById(@PathVariable String id){
        return doctorService.findById(id);
    }

    @PostMapping(value = "/doctor")
    public Mono<Doctor>save(@RequestBody Doctor doctor){
        return doctorService.save(doctor);
    }
}
