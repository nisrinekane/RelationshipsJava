package com.nisrinekane.relationshipsjava.repositories;


import com.nisrinekane.relationshipsjava.models.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepositories extends CrudRepository<License, Long> {
    // this method retrieves all the languages from the database
    List<License> findAll();
    // this method finds languages with creators containing the search string
//    List<License> findByCreatorContaining(String search);
    // this method counts how many names contain a certain string
//    Long countByNameContaining(String search);
    // this method deletes a language that starts with a specific title
//    Long deleteByIdStartingWith(String search);

}