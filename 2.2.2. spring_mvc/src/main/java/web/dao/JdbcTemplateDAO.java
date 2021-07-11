package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import web.models.Person;
import web.models.PersonMapper;

import java.util.List;
@Component
public class JdbcTemplateDAO implements DAO {
    private final JdbcTemplate jdbcTemplate;
/*      Работаем через JdbcTemplate.
        для нее нужна зависимость spring-jdbc
        настройки прописаны в WebConfig
 */
    @Autowired
    public JdbcTemplateDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Person> index() {

        //return jdbcTemplate.query("SELECT * FROM Person",new PersonMapper());
        return jdbcTemplate.query("SELECT * FROM Person"
                ,new BeanPropertyRowMapper<>(Person.class)); // мы можем не создавать свой Маппер а воспользоваться готовым от Spring JDBC
    }

    @Override
    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO Person VALUE (1,?,?,?)",
                person.getName(),
                person.getAge(),
                person.getEmail());
    }

    @Override
    public void update(int id, Person updatePerson) {
        jdbcTemplate.update("UPDATE Person SET name=?, age=?, email=? WHERE id=?"
                ,updatePerson.getName()
                ,updatePerson.getAge()
                ,updatePerson.getEmail()
                ,id);
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?",id);
    }

    @Override
    public Person show(int id) {
//        return jdbcTemplate.query("SELECT * FROM Person WHERE id = ?",
//                new Object[]{id},new PersonMapper())
//                .stream().findAny().orElse(null);
        return jdbcTemplate.query("SELECT * FROM Person WHERE id = ?",
                new Object[]{id},new BeanPropertyRowMapper<>(Person.class)) // мы можем не создавать свой Маппер а воспользоваться готовым от Spring JDBC
                .stream().findAny().orElse(null);
    }
}
