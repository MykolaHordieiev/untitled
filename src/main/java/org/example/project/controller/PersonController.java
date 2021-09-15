package org.example.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.project.entity.Person;
import org.example.project.entity.PersonDto;
import org.example.project.service.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public Person create(@RequestBody PersonDto dto) {
        return personService.createPerson(dto);
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/{id}")
    public Person remove(@PathVariable("id") Long id) {
        return personService.delete(id);
    }
}
