package com.thymeleaf.course.domain.model.entity;

import com.thymeleaf.course.domain.model.dictionary.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PACKAGE)
public class Employee {

    Long id;
    String firstName;
    String lastName;
    String email;
    Gender gender;
    Company company;
    Skill skill;
}
