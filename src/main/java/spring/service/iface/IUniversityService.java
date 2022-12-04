package spring.service.iface;

import spring.doMain.University;

import java.util.List;

public interface IUniversityService {
    University create(University university);

    void deleteById(int id);

    University update(University university);

    University findById(int id);

    List<University> createAll(List<University> universitiesList);

    List<University> findByCountOfStudents(int countOfStudents);

    List<University> findAll();

    University findByName(String name);

}
