package web.dao;

import web.models.Person;

import java.util.List;

public interface DAO {
    List<Person> index();

    void save(Person person);

    void update(int id, Person updatePerson);

    void delete(int id);

    Person show(int id);
}
