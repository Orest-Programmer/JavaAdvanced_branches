package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.doMain.University;
import spring.service.iface.IUniversityService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lesson17Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =SpringApplication.run(Lesson17Application.class, args);

        IUniversityService universityService = context.getBean(IUniversityService.class);

        List<University> universitiesList = new ArrayList<>();

        universitiesList.add(new University("University1", 1, 1, "Львів"));
        universitiesList.add(new University("University2", 2, 2, "Київ"));
        universitiesList.add(new University("University3", 3, 3, "Луганськ"));
        universitiesList.add(new University("University4", 4, 4, "Херсон"));

        universityService.createAll(universitiesList);
        universityService.findAll().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        universityService.deleteById(3);
        universityService.findAll().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        System.out.println(universityService.findByName("University1"));
        System.out.println("-----------------------------------------------");

        System.out.println(universityService.findById(2));
        System.out.println("-----------------------------------------------");

        System.out.println(universityService.findByCountOfStudents(2));

    }
}
