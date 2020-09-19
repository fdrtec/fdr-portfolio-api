package com.fdrtec.portfolio.api.controller;

import com.fdrtec.portfolio.api.document.Appointment;
import com.fdrtec.portfolio.api.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping(value = "/appointment")
    public Flux<Appointment> getAppointments() {
        return appointmentService.findAll();
    }

    @GetMapping(value = "/appointment/{id}")
    public Mono<Appointment> getAppointmentById(@PathVariable String id) {
        return appointmentService.findById(id);
    }

    @PostMapping(value = "/appointment")
    public Mono<Appointment> save(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }

    @DeleteMapping(value = "/appointment")
    public Mono<Appointment> delete(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }
}
