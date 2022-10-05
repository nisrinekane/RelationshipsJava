package com.nisrinekane.relationshipsjava.controllers;


import com.nisrinekane.relationshipsjava.models.License;
import com.nisrinekane.relationshipsjava.models.Person;
import com.nisrinekane.relationshipsjava.services.LicenseService;
import com.nisrinekane.relationshipsjava.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LicenseController {
    @Autowired
    LicenseService licenseService;

    @Autowired
    PersonService personService;

    //show all licenses
    @RequestMapping("/licenses")
    public String index(Model model,
                        @ModelAttribute("license") License license) {
        List<License> licenses = licenseService.allLicenses();
        model.addAttribute("licenses", licenses);
        return "licenses.jsp";
    }

    @GetMapping("/licenses/{license_id}")
    public String showLicense(@PathVariable Long license_id, Model model) {

        License someAwesomeLicense = licenseService.findLicense(license_id);
        model.addAttribute("license", someAwesomeLicense);

        List<Person> persons = personService.allPersons();
        model.addAttribute("persons", persons);

        return "showLicense.jsp";
    }

    @GetMapping("/licenses/new")
    public String createLicense(Model model, @ModelAttribute("license") License license ) {
        List<Person> persons = personService.allPersons();
        model.addAttribute("persons", persons);
        return "license.jsp";
    }

    @PostMapping("/licenses")
    public String licenses(@Valid @ModelAttribute("license") License license, BindingResult result) {
        // error handling with binding result omitted
        if (result.hasErrors()) {
            return "license.jsp";
        }
        licenseService.createLicense(license); // Already has the license!
        return "redirect:/persons";
    }


}

