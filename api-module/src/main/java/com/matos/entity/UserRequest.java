package com.matos.entity;

import lombok.Data;
import lombok.Getter;

@Data
public class UserRequest {
    private String id;
    private String userName;
    private String userPassword;
}
