package com.matos.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserResponse {

    private long id;
    private String userName;
    private String userPassword;
    private boolean status;
}
