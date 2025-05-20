package com.matos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {

    private long id;
    private String userName;
    private String userPassword;
    private boolean status;
}
