package com.assignment.question;

import lombok.Getter;

// Part 1.1 Define context independent properties (shared)

@IntrinsicState
@Getter
public class UserIntrinsicState {
    private final String name;
    private final Integer age;
    private final String gender;
    private final String email;
    private final String phoneNumber;
    private final Byte[] photo;

    // CTOR
    public UserIntrinsicState(String name, Integer age, String gender, String email, String phoneNumber, Byte[] photo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
    }
}