package cz.vutbr.utko.persondatabase.service;

import cz.vutbr.utko.persondatabase.model.Person;

import java.util.List;

public interface IPersonService {
    public List<Person> findAll();
    public Person findById(long id);
}
