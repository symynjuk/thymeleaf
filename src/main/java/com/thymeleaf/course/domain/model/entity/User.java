package com.thymeleaf.course.domain.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    Long id;
    String firstName;
    String lastName;
    String email;
    String password;
    String role;
}
