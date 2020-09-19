package com.fdrtec.portfolio.api.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Patient extends User{
    private Boolean credit;

    public Patient(String _id, String name, String email, String password, String phoneNumber, Boolean credit) {
        super(_id, name, email, password, phoneNumber);
        this.credit = credit;
    }
}
