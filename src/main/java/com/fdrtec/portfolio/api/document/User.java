package com.fdrtec.portfolio.api.document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public abstract class User {
    @Id
    protected String _id;
    protected String name;
    protected String email;
    protected String password;
    protected String phoneNumber;
}
