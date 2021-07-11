package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.Person;

import java.util.List;
@Component
public class HibernateDAO implements DAO {

//    @Autowired
//    private SessionFactory sessionFactory;


    @Override
    public List<Person> index() {
        return null;
    }

    @Override
    public void save(Person person) {
       // sessionFactory.getCurrentSession().save(person);
    }

    @Override
    public void update(int id, Person updatePerson) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Person show(int id) {
        return null;
    }
}
