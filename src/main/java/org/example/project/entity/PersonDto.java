package org.example.project.entity;

import lombok.Data;

@Data
public class PersonDto {
    private String login;
    private String firstName;
    private String lastName;
    private int age;
}
