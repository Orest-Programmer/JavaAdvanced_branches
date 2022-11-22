package spring.dao.inerface;

import spring.doMain.Student;

import java.util.List;


public interface IStudentDao {

    Student readById(int id);

    List<Student> readAll();

    Student create(Student student);

    Student update (Student student);

    void delete(int id);
}
