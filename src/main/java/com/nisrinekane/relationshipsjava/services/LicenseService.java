package com.nisrinekane.relationshipsjava.services;


import com.nisrinekane.relationshipsjava.models.License;
import com.nisrinekane.relationshipsjava.repositories.LicenseRepositories;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LicenseService {
    // adding the languages repository as a dependency
    private final LicenseRepositories licenseRepositories;

    public LicenseService(LicenseRepositories licenseRepositories) {

        this.licenseRepositories = licenseRepositories;
    }
    // returns all the expense
    public List<License> allLicenses() {
        return licenseRepositories.findAll();
    }
    // creates a language
    public License createLicense(License e) {

        return licenseRepositories.save(e);
    }
    // deletes an expense
    public License deleteLicense(long id) {
        licenseRepositories.deleteById(id);
        return null;
    }

    // retrieves an expense
    public License findLicense(Long id) {
        //optional: could exist or not
        Optional<License> optionalLanguages = licenseRepositories.findById(id);
        //old version:
//        if(optionalLanguages.isPresent()) {
//            return optionalLanguages.get();
//        } else {
//            return null;
//        }
        //new version:
        return optionalLanguages.orElse(null);
    }

    public License updateLanguages(Long id, String number, Date expirationDate, String state) {
        License license = findLicense(id);
        license.setNumber(number);
        license.setExpirationDate(expirationDate);
        license.setState(state);
        return licenseRepositories.save(license);
    }
}
