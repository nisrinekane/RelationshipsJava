package com.nisrinekane.relationshipsjava.controllers;

import com.nisrinekane.relationshipsjava.models.License;
import com.nisrinekane.relationshipsjava.models.Person;
import com.nisrinekane.relationshipsjava.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/persons/{id}")
    public String showPerson(@PathVariable Long id, Model model) {
        Person someAwesomePerson = personService.findPerson(id);
        model.addAttribute("person", someAwesomePerson);
        return "showperson.jsp";
    }

    //show all persons
    @RequestMapping("/persons")
    public String index(Model model,
                        @ModelAttribute("person") Person person) {
        List<Person> persons = personService.allPersons();
        model.addAttribute("persons", persons);
        return "persons.jsp";
    }

    @PostMapping("/persons")
    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        // error handling with binding result omitted
        if (result.hasErrors()) {
            return "showperson.jsp";
        }
        personService.createPerson(person); // Already has the person!
        return "redirect:/persons";
    }


}
