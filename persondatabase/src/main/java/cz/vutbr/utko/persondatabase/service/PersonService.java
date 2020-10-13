package cz.vutbr.utko.persondatabase.service;

import cz.vutbr.utko.persondatabase.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService{
    @Autowired
    private JdbcTemplate jdbc;
    public List<Person> findAll(){
        String sql="SELECT*FROM PERSON";
        List<Person> cities=jdbc.query(sql, new BeanPropertyRowMapper(Person.class));
        return cities;
    }
    public Person findById(long id){
        String sql="SELECT * FROM PERSON WHERE ID=?";
        Person person = (Person) jdbc.queryForObject(sql,new Object[]{id}, new BeanPropertyRowMapper(Person.class));
        return person;
    }
}
