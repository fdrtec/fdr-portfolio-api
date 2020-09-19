package com.fdrtec.portfolio.api.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@Document
public class Appointment {
    private Date appointmentDate;
    private Patient patient;
    private Doctor doctor;
}
