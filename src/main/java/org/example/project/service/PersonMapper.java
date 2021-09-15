package org.example.project.service;

import org.example.project.entity.Person;
import org.example.project.entity.PersonDto;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public Person getEntityFromDto(PersonDto dto) {
        Person person = new Person();
        person.setLogin(dto.getLogin());
        person.setAge(person.getAge());
        person.setLastName(dto.getLastName());
        person.setFirstName(dto.getFirstName());
        return person;
    }
}
