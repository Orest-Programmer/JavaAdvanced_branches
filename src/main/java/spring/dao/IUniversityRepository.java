package spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.doMain.University;

import java.util.List;

public interface IUniversityRepository extends JpaRepository<University, Integer> {

    List<University> findByCountOfStudents(int countOfStudents);

    University findByName(String name);

}
