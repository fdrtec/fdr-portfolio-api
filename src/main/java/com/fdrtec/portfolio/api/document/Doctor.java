package com.fdrtec.portfolio.api.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document

public class Doctor {

    @Id
    private String _id;
    private String name;
    private String specialization;
}
