package cz.vutbr.utko.persondatabase.controller;

import cz.vutbr.utko.persondatabase.model.Person;
import cz.vutbr.utko.persondatabase.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private IPersonService personService;

    @RequestMapping("/users")
    public List<Person> findUsers(){
        return personService.findAll();
    }
    @RequestMapping("/users/{userId}")
    public Person findUser(@PathVariable Long userId) {
        return personService.findById(userId);
    }

}

