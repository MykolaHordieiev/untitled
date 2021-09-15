package org.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
public class Person {
    @Id
    private Long id;
    private String login;
    private String firstName;
    private String lastName;
    private int age;
}