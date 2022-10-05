package com.nisrinekane.relationshipsjava.repositories;

import com.nisrinekane.relationshipsjava.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepositories extends CrudRepository<Person, Long> {
    // this method retrieves all the languages from the database
    List<Person> findAll();
    // this method finds languages with creators containing the search string
//    List<Person> findByCreatorContaining(String search);
    // this method counts how many names contain a certain string
    Long countByFirstNameContaining(String search);
    // this method deletes a language that starts with a specific title
//    Long deleteByNameStartingWith(String search);

}