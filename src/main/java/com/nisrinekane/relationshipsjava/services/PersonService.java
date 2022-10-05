package com.nisrinekane.relationshipsjava.services;

import com.nisrinekane.relationshipsjava.models.Person;
import com.nisrinekane.relationshipsjava.repositories.PersonRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    // adding the languages repository as a dependency
    private final PersonRepositories personRepositories;

    public PersonService(PersonRepositories personRepositories) {

        this.personRepositories = personRepositories;
    }
    // returns all the expense
    public List<Person> allPersons() {

        return personRepositories.findAll();
    }
    // creates a language
    public Person createPerson(Person e) {
        return personRepositories.save(e);
    }
    // deletes an expense
    public Person deletePerson(long id) {
        personRepositories.deleteById(id);
        return null;
    }

    // retrieves an expense
    public Person findPerson(Long id) {
        //optional: could exist or not
        Optional<Person> optionalLanguages = personRepositories.findById(id);
        //old version:
//        if(optionalLanguages.isPresent()) {
//            return optionalLanguages.get();
//        } else {
//            return null;
//        }
        //new version:
        return optionalLanguages.orElse(null);
    }

    public Person updateLanguages(Long id, String firstName, String lastName) {
        Person person = findPerson(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return personRepositories.save(person);
    }
}
