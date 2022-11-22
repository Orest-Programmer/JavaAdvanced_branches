package spring;

import spring.dao.inerface.IStudentDao;
import spring.doMain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        IStudentDao studentDao = context.getBean(IStudentDao.class);

        studentDao.create(new Student(1, "Андрій", 19));
        studentDao.create(new Student(2, "Сергій", 20));
        studentDao.create(new Student(3, "Міша", 17));
        studentDao.create(new Student(4, "Олег", 14));

        studentDao.readAll().stream().forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        studentDao.delete(3);
        studentDao.readAll().stream().forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        studentDao.update(new Student(2, "Діма", 20));
        studentDao.readAll().stream().forEach(System.out::println);




    }
}
