package com.fdrtec.portfolio.api.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Doctor extends User {
    private String specialization;

    public Doctor(String _id, String name, String email, String password, String phoneNumber, String specialization) {
        super(_id, name, email, password, phoneNumber);
        this.specialization = specialization;
    }
}