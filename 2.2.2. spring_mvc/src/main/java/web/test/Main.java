package web.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.SpringConfig;
import web.dao.DAO;
import web.dao.HibernateDAO;
import web.models.Person;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        DAO dao = context.getBean(HibernateDAO.class);
//        dao.save(new Person("Ruslan",26,"rus@email.ru"));
    }
}
