package web.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.SpringConfig;
import web.config.WebConfig;

public class Main {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(WebConfig.class);
       PersonDAO personDAO = context1.getBean(PersonDAO.class);
       Cat cat = context.getBean("cat",Cat.class);

    }
}
