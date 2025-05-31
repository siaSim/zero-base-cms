package com.example.cms.user.domain;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class SignUpForm {
    private String email;
    private String name;
    private String password;
    private LocalDate birt;
    private String phone;
}
