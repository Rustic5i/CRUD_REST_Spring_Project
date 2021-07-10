package web.dao;

import org.springframework.stereotype.Component;
import web.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private List<Person> peopleList;
    private Integer PEOPLE_COUNT;

    {
        peopleList = new ArrayList<>();
        PEOPLE_COUNT = 0;
        peopleList.add(new Person(++PEOPLE_COUNT,"Ruslan",26,"rus@email.ru"));
        peopleList.add(new Person(++PEOPLE_COUNT,"Andrey",25,"andrey@email.ru"));
        peopleList.add(new Person(++PEOPLE_COUNT,"Masha",24,"masha@email.ru"));
        peopleList.add(new Person(++PEOPLE_COUNT,"Ola",22,"olala@email.ru"));
    }
    public List<Person> index() {
        return peopleList;
    }
    public Person show(int id){
        return peopleList.stream().filter(people -> people.getId()==id).findAny().orElse(null);
    }
    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        peopleList.add(person);
    }
    public void update (int id, Person updatePerson){
        Person person = show(id);
        person.setName(updatePerson.getName());
        person.setAge(updatePerson.getAge());
        person.setEmail(updatePerson.getEmail());
    }
    public void delete(int id){
        peopleList.removeIf(person -> person.getId()==id);
    }
}
