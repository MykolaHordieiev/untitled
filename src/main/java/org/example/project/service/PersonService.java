package org.example.project.service;

import lombok.RequiredArgsConstructor;
import org.example.project.entity.Person;
import org.example.project.entity.PersonDto;
import org.example.project.repo.PersonRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Person createPerson(PersonDto dto) {
        Person entityFromDto = personMapper.getEntityFromDto(dto);
        return personRepository.save(entityFromDto);
    }

    public Person delete(Long id) {
        Person personById = getPersonById(id);
        personRepository.delete(personById);
        return personById;
    }
}
